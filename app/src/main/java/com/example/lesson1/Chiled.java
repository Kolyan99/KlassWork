package com.example.lesson1;

public class Chiled extends Parent {

    protected int age = 12;

    @Override
    void speak() {
        super.speak();
        System.out.println("I speak loudly");
        // super.speak();
    }

    public static void main(String[] args) {
        Parent chiled = new Chiled();
        Parent parent = new Parent();
        chiled.eye_color = "green";
        System.out.println("eye color of the chiled: " + chiled.eye_color);
        System.out.println("eye color of the parent: " + parent.eye_color);
        chiled.speak();
        //parent.speak();


    }

    void phoneNumber(int number) {

    }

    void phoneNumber(int number, String mobile_operator) {

    }
}
class Parent{

    protected String eye_color = "blue";

    void speak(){
        System.out.println("I speak quielty");
    }
}
class Uncle{
    public static void main(String[] args) {
        Parent parent = new Parent();
        Chiled child = new Chiled();
        System.out.println(parent.eye_color);
        System.out.println(child.age);
    }
}
