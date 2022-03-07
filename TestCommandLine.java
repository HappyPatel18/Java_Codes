package com.Myproject;
import com.Myproject.UserNamePassword;

public class TestCommandLine {

    public static void main(String[] args) {
        String arr[]=new String[args.length];

     for(int i=0;i<args.length;i++){
         arr[i]=args[i].toString();
     }

        UserNamePassword obj=new UserNamePassword();

       if(obj.verifyLogin(arr[0],arr[1])){
           System.out.println("Verified");
       }else{
           System.out.println("Not Verified");
       }
    }
}
