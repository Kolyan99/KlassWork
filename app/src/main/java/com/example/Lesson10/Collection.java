package com.example.Lesson10;


import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {
        ArrayList <String> arrarList = new ArrayList();
        arrarList.add("hello");
        arrarList.add("bye");
        arrarList.add("world");

        System.out.println(arrarList.indexOf("bye"));
        arrarList.add(1,"hi");
        System.out.println(arrarList.indexOf("bye"));
    }
}
