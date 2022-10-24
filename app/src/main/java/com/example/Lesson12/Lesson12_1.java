package com.example.Lesson12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;

public class Lesson12_1 {
    static Consumer<String> printUpperCase = str ->{
        System.out.print(str.toUpperCase() + " ");
    };

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Aryna"));
        users.add(new User("Vasua"));
        users.add(new User("Sasha"));
        users.add(new User("Pasha"));
        users.add(new User("Tanya"));

       // for(User user :users){
       //     System.out.print(user.getName() +" ");
       // }

        users.stream().map(User::getName).forEach((n) -> {
            System.out.print(n +" " );
        });
        users.stream().map(User::getName).forEach(printUpperCase);

        ;
    }
}

class User{
    private String name;

    User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name  ;

    }
}
