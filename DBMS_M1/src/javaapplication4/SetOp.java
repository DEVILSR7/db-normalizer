/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author ssmis
 */
public class SetOp {
    
    // is a subset of b?
    static boolean isSubSetOf(TreeSet<String> a, TreeSet<String> b){
        for(String i : a){
            if(!b.contains(i)){
                return false;
            }
        }
        return true;
    }
    
    static boolean isProperSubSetOf(TreeSet<String> a, TreeSet<String> b){
        if(isSubSetOf(a,b) && a.size()!=b.size()){
            return true;
        }
        return false;
    }
    
    //a-b
    static TreeSet<String> minus(TreeSet<String> a, TreeSet<String> b){
        TreeSet<String> temp=new TreeSet<String>();
        for(String i : a){
            if(!b.contains(i)){
                temp.add(i);
            }
        }
        return temp;
    }
    
    static TreeSet<String> intersection(TreeSet<String> a, TreeSet<String> b){
        TreeSet<String> ans=new TreeSet<String>();
        for(String i : a){
            if(b.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    
    static TreeSet<String> minus(TreeSet<String> a, String b){
        TreeSet<String> temp=new TreeSet<String>();
        for(String i : a){
            temp.add(i);
        }
        temp.remove(b);
        return temp;
    }
    static boolean isEqual(TreeSet<String> a, TreeSet<String> b){
        if(a.size()!=b.size()){
            return false;
        }
        for(String i : b){
            if(!a.contains(i)){
                return false;
            }
        }
        return true;
    }
    
    static TreeSet<String> copyOf(TreeSet<String> b){
        TreeSet<String> a=new TreeSet<String>();
        for(String i : b){
            a.add(i);
        }
        return a;
    }
    
    static HashSet<TreeSet<String>> copyOf(HashSet<TreeSet<String>> a){
        HashSet<TreeSet<String>> b=new HashSet<TreeSet<String>>();
        for(TreeSet<String> i : a){
            b.add(copyOf(i));
        }
        return b;
    }
    
}
