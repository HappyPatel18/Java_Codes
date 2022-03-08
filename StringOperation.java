package com.Myproject;

import java.util.Scanner;

public class StringOperation {

    static int upper;
    static int lower;
    static int number;
    static int special;

    public static void doOperationWithRegEx(int a, String b){
        StringBuilder sb = new StringBuilder();


        if(a==1){
            for(int i=b.length()-1;i>=0;i--){
                sb.append(b.charAt(i));
            }
            System.out.println(sb.toString());
        }
        else if(a==2){
           for(int i=0;i<b.length();i++){
                char ch=b.charAt(i);
               if(Character.isUpperCase(b.charAt(i))){    //if(ch >= 'A' && ch <= 'Z')
                        upper++;
               }
              else if(Character.isLowerCase(b.charAt(i))){    //if(ch >= 'a' && ch <= 'z')
                   lower++;
               }
               else if(b.charAt(i) >= '0'
                       && b.charAt(i) <= '9'){       // if(ch >= '0' && ch <= '9')
                       number++;
               }
               else{
                   special++;
               }
           }

            System.out.println("Lower case letters : " + lower);
            System.out.println("Upper case letters : " + upper);
            System.out.println("Number : " + number);
            System.out.println("Special : " + special);

        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the command here");
        int commmand=input.nextInt();

        System.out.println("Enter the input here ");
        String word=input.next();
        doOperationWithRegEx(commmand,word);


    }
}
