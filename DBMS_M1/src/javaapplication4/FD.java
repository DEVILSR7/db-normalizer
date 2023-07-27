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
public class FD {
    TreeSet<String> X=new TreeSet<String>();
    TreeSet<String> Y=new TreeSet<String>();
    int NF;
    FD(String x, String y){
        String[] x_list=x.split(",",20);
        String[] y_list=y.split(",",20);
        for(int i=0;i<x_list.length;i++){
            X.add(x_list[i]);
        }
        for(int i=0;i<y_list.length;i++){
            Y.add(y_list[i]);
        }
    }
    FD(TreeSet<String> X, TreeSet<String> Y){
        this.X=SetOp.copyOf(X);
        this.Y=SetOp.copyOf(Y);
    }
    
    public String toString(){
        return X+"->"+Y;
    }
    
    boolean isEqual(FD i){
        if(SetOp.isEqual(this.X, i.X) && SetOp.isEqual(this.Y,i.Y)){
            return true;
        }
        return false;
    }
}
