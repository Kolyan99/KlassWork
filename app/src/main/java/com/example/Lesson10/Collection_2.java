package com.example.Lesson10;

import java.util.SortedSet;
import java.util.TreeSet;

public class Collection_2 {
    public static void main(String[] args) {

        SortedSet sortedSet = new TreeSet();
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("orange");
        sortedSet.add("banana");

        System.out.println(sortedSet);
    }
}
