package com.trimindtech.training.day03;

public class StringIterator {
   public static void main(String[] args){
        String[] names = new String[3];
        names[0] = "anu";
        names[1] = "mahek";
        names[2] = "tanna";
        printNames(names);
   }
       public static void printNames(String[] names) {
        for(String name : names){
            System.out.println(name);
        }
    }
}
