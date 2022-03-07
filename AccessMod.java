package com.Myproject;




public class AccessMod {


    public int id=1;
    public long rupees=9999999999999L;
    char a='A';
    private String name="Happy";
    boolean ans=true;
    protected float marks=9.55F;
    protected double number=9924011.260D;

     public void check_method(){
         System.out.println("YEvvyyy");
     }

     public int numbers(int i){
         return 0;
     }

    public void printProperties(){
        System.out.println(id);
        System.out.println(a);
        System.out.println(name);
        System.out.println(ans);
        System.out.println(marks);
        System.out.println(number);
        System.out.println(rupees);

    }




    public static void main(String[] args) {

    }
}
