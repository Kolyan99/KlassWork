package com.example.Lesson10;

import java.util.Arrays;

public class Lesson10_3 {
    public static void main(String[] args) {

        int [][][] numbers = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9}
                }
        };

        for(int[][] numbers2D: numbers){
            for(int[] numbers1D: numbers2D){
                for(int number: numbers1D){
                    System.out.print(number + "\t");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
