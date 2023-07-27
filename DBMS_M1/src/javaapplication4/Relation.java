/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.*;

/**
 *
 * @author ssmis
 */
public class Relation {
    TreeSet<String> attributes=new TreeSet<String>();
    ArrayList<FD> fds=new ArrayList<FD>();
    ArrayList<FD> minimal_fds=new ArrayList<FD>();
    HashSet<TreeSet<String>> Keys=new HashSet<TreeSet<String>>();
    TreeSet<String> key_attributes=new TreeSet<String>();
    HashSet<TreeSet<String>> super_keys=new HashSet<TreeSet<String>>();
    int NF=4;
    //TreeSet<String> primaryKey=new TreeSet<String>();
    
    Relation(){
        ;
    }

    Relation(FD fd) {
        for(String i : fd.X){
            attributes.add(i);
        }
        for(String j : fd.Y){
            attributes.add(j);
        }
    }
    
    TreeSet<String> generateClosure(TreeSet<String> X){
        TreeSet<String> closureX=new TreeSet<String>();
        TreeSet<String> oldX=new TreeSet<String>();
        closureX=SetOp.copyOf(X);
        do{
            oldX=SetOp.copyOf(closureX);
            for(FD i : fds){
                if(SetOp.isSubSetOf(i.X,closureX)){
                    closureX.addAll(i.Y);
                }
            }            
        }while(!SetOp.isEqual(oldX,closureX));
        return closureX;
    }
    
    TreeSet<String> generateClosure(TreeSet<String> X, ArrayList<FD> fds){
        TreeSet<String> closureX=new TreeSet<String>();
        TreeSet<String> oldX=new TreeSet<String>();
        closureX=SetOp.copyOf(X);
        do{
            oldX=SetOp.copyOf(closureX);
            for(FD i : fds){
                if(SetOp.isSubSetOf(i.X,closureX)){
                    closureX.addAll(i.Y);
                }
            }            
        }while(!SetOp.isEqual(oldX,closureX));
        return closureX;
    }
    
    void generateKeys(){
        int n=attributes.size();
        String[] arr=new String[attributes.size()];
        ArrayList<TreeSet<String>> super_keys=new ArrayList<TreeSet<String>>();
        int k=0;
        for(String i : attributes){
            arr[k++]=i;
        }
        TreeSet<String> temp=new TreeSet<String>();
        TreeSet<String> tempClosure=new TreeSet<String>();
        for(int mask=0;mask<(1<<n);mask++){
            for(int i=0;i<n;i++){
                int val=mask&(1<<i);
                if(val!=0){
                    temp.add(arr[i]);
                }
            }
            tempClosure=generateClosure(temp);
            if(tempClosure.size()==n){
                super_keys.add(SetOp.copyOf(temp));
            }
            temp.clear();
            tempClosure.clear();
        }
        for(TreeSet<String> i : super_keys){
            this.super_keys.add(i);
        }
        for(int i=0;i<super_keys.size();i++){
            for(int j=0;j<super_keys.size();j++){
                if(SetOp.isSubSetOf(super_keys.get(j),super_keys.get(i)) && i!=j){
                    super_keys.remove(i);
                    i--;
                    break;
                }
            }
        }
        for(TreeSet<String> i : super_keys){
            Keys.add(i);
        }
        for(TreeSet<String> key : Keys){
            key_attributes.addAll(key);
        }
        minimalClosure(fds);
    }
    
    int checkNF(){
        int ans=4;
        for(FD fd : fds){
            ans=Math.min(ans,checkNF(fd));
        }
        return ans;
    }
    
    int checkNF(FD fd){
        
        if(super_keys.contains(fd.X)){
            return 4;
        }
        
        if(super_keys.contains(fd.X) || SetOp.minus(fd.Y,key_attributes).size()==0){
            return 3;
        }
        
        for(TreeSet<String> i : Keys){
            if(SetOp.isProperSubSetOf(fd.X, i) && SetOp.minus(fd.Y,key_attributes).size()!=0){
                fd.NF=1;
                return 1;
            }
        }
        return 2;
    }
    
    ArrayList<Relation> to2NF(){
        ArrayList<Relation> ans=new ArrayList<Relation>();
        ArrayList<FD> invalidFDs = new ArrayList<FD>();
        Relation R=new Relation();
        R.attributes=SetOp.copyOf(this.attributes);
        //check for FDs that forbid 2NF
        for(FD i : fds){
            if(this.checkNF(i)<2){
                TreeSet<String> temp=new TreeSet<String>();
                temp=SetOp.minus(generateClosure(i.Y),i.X);
                FD k=new FD(i.X,temp);
                invalidFDs.add(k);
            }
        }
            // create a new relation corresponding to each FD
        for(FD i : invalidFDs){
            Relation r=new Relation(i);
            ans.add(r);
            TreeSet<String> temp=new TreeSet<String>();
            temp=SetOp.minus(i.Y,key_attributes);
            R.attributes.removeAll(temp);
        }
        ans.add(R);
        for(Relation r : ans){
            for(FD fd : this.fds){
                if(SetOp.isSubSetOf(fd.X, r.attributes)){
                    TreeSet<String> tempClosure=generateClosure(fd.X);
                    TreeSet<String> temp1=SetOp.intersection(tempClosure, r.attributes);
                    r.fds.add(new FD(fd.X,temp1));
                }
            }
        }
        for(Relation r : ans){
            r.generateKeys();
            r.checkNF();
        }
        return ans;        
    }
    
    
    ArrayList<Relation> to3NF(){
        ArrayList<Relation> ans=new ArrayList<Relation>();
        for(FD i : minimal_fds){
            Relation r=new Relation(i);
            r.fds.add(i);
            r.generateKeys();
            ans.add(r);
        }
        int flag=0;
        for(TreeSet<String> i : Keys){
            flag=0;
            for(Relation r : ans){
                if(SetOp.isSubSetOf(i, r.attributes)){
                    flag=1;
                }
            }
            if(flag==0){
                Relation r=new Relation();
                r.attributes=SetOp.copyOf(i);
                r.Keys.add(i);
                ans.add(r);
            }
        }
        return ans;
    }
    
    void minimalClosure(ArrayList<FD> fds){
        ArrayList<FD> mc=new ArrayList<FD>();
        for(FD i : fds){
            if(i.Y.size()==1)
                mc.add(i);
            else{
                for(String j : i.Y){
                    TreeSet<String> temp=new TreeSet<String>();
                    temp.add(j);
                    mc.add(new FD(i.X,temp));
                }
            }
        }
        for(FD i : mc){
            if(i.X.size()==1){
                continue;
            }
            for(String j : i.X){
                if(i.X.size()==1){
                    break;
                }
                TreeSet<String> temp=new TreeSet<String>();
                TreeSet<String> tempClosure=new TreeSet<String>();
                temp.add(j);
                TreeSet<String> remaining=new TreeSet<String>();
                remaining=SetOp.minus(i.X, temp);
                tempClosure=generateClosure(temp,mc);
                //System.out.println("Closure of "+temp+" is "+tempClosure);
                if(SetOp.intersection(remaining, tempClosure).size()!=0){
                    i.X=SetOp.minus(i.X, SetOp.intersection(remaining, tempClosure));
                }
            }
        }
        for(int i=0;i<mc.size();i++){
            ArrayList<FD> tempMC=new ArrayList<FD>();
            for(int j=0;j<mc.size();j++){
                if(i!=j) tempMC.add(mc.get(j));
            }
            FD currFD=new FD(mc.get(i).X,mc.get(i).Y);
            if(SetOp.isSubSetOf(currFD.Y, generateClosure(currFD.X,tempMC))){
                mc.remove(i);
                i--;
            }
        }
        for(int i=0;i<mc.size();i++){
            for(int j=0;j<mc.size();j++){
                if(SetOp.isEqual(mc.get(i).X, mc.get(j).X) && i!=j){
                    mc.get(i).Y.addAll(mc.get(j).Y);
                    mc.remove(j);
                    j--;
                }
            }
        }
        this.fds=mc;
        minimal_fds=mc;
    }
    
    ArrayList<Relation> toBCNF(){
        ArrayList<Relation> ans=new ArrayList<Relation>();
        Relation R=new Relation();
        R.attributes=SetOp.copyOf(this.attributes);
        for(FD fd : fds){
            if(checkNF(fd)!=4){
                System.out.println("For FD "+fd+" NF: "+checkNF(fd));
                Relation r=new Relation();
                r.attributes.addAll(fd.X);
                r.attributes.addAll(fd.Y);
                r.fds.add(fd);
                r.generateKeys();;
                r.checkNF();
                R.attributes=SetOp.minus(R.attributes,fd.Y);
                for(FD fd2 : this.fds){
                    if(SetOp.isSubSetOf(fd2.X, R.attributes)){
                        TreeSet<String> temp1=SetOp.intersection(fd2.Y, R.attributes);
                        if(temp1.size()!=0){
                            FD temp=new FD(fd2.X,temp1);
                            R.fds.add(temp);
                        }
                    }
                }
                R.generateKeys();
                R.checkNF();
                ans.add(r);
                ans.add(R);
                return ans;
            }
        }
        return ans;
    }
    public String toString(){
        String s1="";
        for(int i=0;i<fds.size();i++){
                for(int j=0;j<fds.size();j++){
                    if(fds.get(i).isEqual(fds.get(j)) && i!=j){
                        fds.remove(j);
                        j--;
                    }
                }
            }
        for(FD i : fds){
            s1=s1+i+"\n";
        }
        String str="R"+attributes+"\n\n"+"Keys:\n"+Keys+"\n\nMinimal Closure of FDs:\n"+s1;
        NF=checkNF();
        if(NF==4){
            str=str+"\nNF: BCNF\n";
        }
        else{
            str=str+"\nNF: "+NF+"\n";
        }
        return str;
    }
    
}
