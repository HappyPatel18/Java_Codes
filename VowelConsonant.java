package com.Myproject;

import java.util.Locale;
import java.util.Scanner;

public class VowelConsonant {

    public static void checkChar(String[] a){

      char n=  a[0].toLowerCase(Locale.ROOT).charAt(0);

        switch (n){
            case 'a':
                System.out.println("This is a vowel");break;
            case 'e':
                System.out.println("This is a vowel");break;
            case 'i':
                System.out.println("This is a vowel");break;
            case 'o':
                System.out.println("This is a vowel");break;
            case 'u':
                System.out.println("This is a vowel");break;
            default:
                System.out.println("The entered character is consonant");
        }
    }

    public static void main(String[] args) {
        checkChar(args);
    }
}
