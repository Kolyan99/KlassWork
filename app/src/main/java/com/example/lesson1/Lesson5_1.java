package com.example.lesson1;

public class Lesson5_1 {

    public static void main(String[] args) {
        Friend friend = new Friend("Sasha",30,"25.06.1990");
        Friend friend2 = new Friend("Sasha",30);
        /*friend.age =30;
        friend.name = "Sasha";*/
        friend.born();
        friend2.born();


    }
}

class Friend {

   private String name;
    private int age;
    private String birthdate;

    public Friend(String name2, int age2, String birthdate2){
        this.name = name2;
        this.age = age2;
        this.birthdate = birthdate2;
    }

    public Friend(String name2, int age2){
        this.name = name2;
        this.age = age2;

    }

    void born(){
        String congratulations ="";

        if(birthdate == null || birthdate.isEmpty()){
            congratulations = "no birthday";

        }else {
            congratulations = name+ "has birthday on:" +birthdate
                    + "" + "he is" +age + "years old";

        }
        System.out.println(congratulations);
    }
}