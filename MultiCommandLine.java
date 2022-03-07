package com.Myproject;

import java.util.Locale;

public class MultiCommandLine {

    public int doOpertaions(String[] a){

    int[] arr=new int[a.length];
    for(int i=0;i< a.length;i++){
        try {
            arr[i] = Integer.parseInt(a[i]);
        }

        catch(Exception e){

        }

    }

    int sum=0;
    System.out.println(a[0]);
    if(arr[0]==1){

        for(int i=1;i<a.length;i++){
            sum+=arr[i];
        }
        System.out.println("Total Sum " + sum);
    }
    if(arr[1]==2){
        for(int i=0;i< a.length;i++){
            a[i]=a[i].toLowerCase(Locale.ROOT);
            System.out.print(a[i]+" "+" ");
        }

    }



        return 0;
    }

    public static void main(String[] args) {

    }
}
