package com.example.lesson6;

public class Lesson7_4 {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Mum mum = new Mum();
        chekType(mum);
        Lesson7_4 lesson7_4 = new Lesson7_4();
        System.out.println(lesson7_4.getName(""));



    }

    String getName(String name) {
        if (name.isEmpty()) {
            return "NAME CAN' T BE EMPTY";
        } else {
            return name;
        }
    }

   static void chekType(Object object){
        if(object instanceof Mum){
            ((Mum) object).sleep();
        }else {
            System.out.println("Not parent");
        }
    }
}

class Parent{
    void walk(){
        System.out.println("parent walk");
    }
}

class Dad extends Parent{
    void walk(){
        System.out.println("dad walk");
    }

}

class Mum extends Parent{
    void walk(){
        System.out.println("mum walk");
    }
    void sleep(){
        System.out.println("mum is sleeping");
    }

}
