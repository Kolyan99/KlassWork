package com.example.lesson6;
//interface

public class Lesson6_1 implements IAuth {
    
    static boolean isUserLoggedIn = false;
    
    public static void main(String[] args) {
        Lesson6_1 lesson6 = new Lesson6_1();
        lesson6.login();
    }

    

    @Override
    public void login() {
        isUserLoggedIn = true;
        System.out.println("user loggen in");
    }

    @Override
    public void logout() {
        boolean isUserLoggenIn = false;
        System.out.println("user logget in");

    }
}

interface IAuth{
    
    void login();
    
    void logout();
    
}
