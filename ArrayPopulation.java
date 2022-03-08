package com.Myproject;
import java.util.Scanner;

class ArrayPopulation {

    static int[] alternateMerge(int arr1[], int arr2[],
                               int n1, int n2, int arr3[])
    {
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2)
        {
            arr3[k++] = arr2[i++];
            arr3[k++] = arr1[j++];

        }


        return arr3;
    }

    public static void main(String args[])
    {

         int n=0;
        Scanner obj=new Scanner(System.in);
        n= obj.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] arr3 = new int[n+n];
        System.out.println("Enter "+n+" Number of elements for 1st Array");

        for(int z=0;z<n;z++){
            arr1[z]=obj.nextInt();
        }
        System.out.println("Enter "+n+" Number of elements for 1st Array");
        for(int z=0;z<n;z++){
            arr2[z]=obj.nextInt();
        }

      int[] arr4=  alternateMerge(arr1, arr2, n, n, arr3);

        System.out.println("Array after merging");
        for (int i = 0; i < n + n; i++)
            System.out.print( arr4[i] + " ");



    }
}

