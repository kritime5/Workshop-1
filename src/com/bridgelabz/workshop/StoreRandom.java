package com.bridgelabz.workshop;
//Take random int array of size 20.

import java.sql.SQLOutput;
//store random value in array 20 size

public class StoreRandom {
    public static int insertNumbers(int n1,int n2){
        int min=n1;
        int max=n2;
        int randomNumber=min+(int)(Math.random()*(max-min)+1);
        return randomNumber;
    }
    public static int computeLocation(int l1,int l2){
        int min=l1;
        int max=l2;
        int computeLocation=min+(int)(Math.random()*(max-min)+1);
        return computeLocation;
    }

    public static void main(String[] args) {

           int array  [] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Arrays:");
        for(int i=0;i<20;i++){
            int random1=insertNumbers(1,20);
            array[i]=random1;
            System.out.println(array[i]+" ");
        }

    }
}
