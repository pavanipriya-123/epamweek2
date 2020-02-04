package com.epam.epamtask;

import java.util.*;
public class Sweets {
     
        int weight;
         int cost;
        String  colour;
         String name;
         Sweets(int x,int z,String y,String a)
         {
            weight=x;
            cost=z;
            colour=y;
            name=a;
         }
}
 class sortbyweight implements Comparator<Sweets>{
    public int compare(Sweets a,Sweets b){
    return a.weight-b.weight;
    }
}
 class sortbycost implements Comparator<Sweets>{
    public int compare(Sweets a,Sweets b){
    return a.cost-b.cost;
    }
}