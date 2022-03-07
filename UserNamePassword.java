package com.Myproject;

public class UserNamePassword {

    String username="happy";
    String password="happy123";

    public boolean verifyLogin(String usr,String pass){

        System.out.println(usr+pass);
        if(username.equals(usr) && password.equals(pass)){
            return true;
        }
        else{
            return false;
        }
    }
}
