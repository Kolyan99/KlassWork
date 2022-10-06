package com.example.lesson6;

public class Lesson7_3 {
    private String privateVar = "Hello";
    String publicVar = "HELLO";
    static String staticVar = "Bye";

    public static void main(String[] args) {
        Lesson7_3 lesson7_3 = new Lesson7_3();
        lesson7_3.callInnerClass();
        lesson7_3.callNestedClass();

    }

    void callInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerage + " inner class called");
        innerClass.callOuterClassVariable();
    }
    void callNestedClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerage + " nested class called");
        innerClass.callOuterClassVariable();
    }
    class InnerClass{
        int innerage = 18;

        void callOuterClassVariable(){
            System.out.println(privateVar);
            System.out.println(publicVar);
            System.out.println(staticVar);

        }
    }

    static class NestedClass{
        int nestage = 18;

        void callOuterClassVariable(){
         //   System.out.println(priveteVar);
        //    System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }
}
