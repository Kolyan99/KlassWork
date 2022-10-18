package com.example.Lesson10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_1 {
    public static void main(String[] args) {
        ArrayList<String> arrarList = new ArrayList();
        arrarList.add("hello");

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("hello");

        System.out.println(arrarList);
        System.out.println(linkedList);
    }
}
