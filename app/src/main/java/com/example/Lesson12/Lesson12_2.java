package com.example.Lesson12;

public class Lesson12_2 {
    public static void main(String[] args) {
     //   Operationable operationable = new Operationable() {
     //       @Override
      //      public int calculate(int a, int b) {
      //          return 0;
      //      }
      //  };

        Operationable operationable;
        operationable = (a,b)-> a*b+30;
        int resalt = operationable.calculate(10,10);
        System.out.println(resalt);

        Operationable2<Integer> operationable2;
        operationable2 = (a,b)-> a>b;
        boolean resalt2 = operationable2.calculate(10,20);
        System.out.println(resalt2);

        Operationable3<Integer, String> operationable3;
        operationable3 = (a,b)-> {
           return a+b+" I will be back";
        };
        String resalt3 = operationable3.calculate(10,20);
        System.out.println(resalt3);

        Operationable4<Integer> operationable4;
        operationable4 = (a,b)-> System.out.println(a+b);

        operationable4.calculate(10,20);


    }
}
@FunctionalInterface
interface Operationable{

    int calculate(int a, int b);
}

interface Operationable2<T>{
    boolean calculate(T t, T t1);
}
//Function
interface Operationable3<T,R>{
    R calculate(T t, T t1);
}

//Consumer
interface Operationable4<T>{
    void  calculate(T t, T t1);
}