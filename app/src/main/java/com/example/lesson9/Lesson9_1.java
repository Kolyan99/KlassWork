package com.example.lesson9;

import java.util.Arrays;

public class Lesson9_1 {
    // Среднее значение температуры
    public static void main(String[] args) {
        int[] temp = new int[]{16,-17,22,0,21,33,5,4,-7};
        double averageTemp;
        int sumofTemp = 0;
        for (int i = 0; i < temp.length; i++) {
            sumofTemp += temp[i];
        }
        averageTemp = (double) sumofTemp / temp.length;
        System.out.println(averageTemp);

        // Максимальное и минимальное число

    int[] masive = new int[]{25,47,34,18,96,33,28,55,87,13};
    int minValue =0;
    int maxValue =0;
    Arrays.sort(masive);
    minValue = masive[0];
    maxValue = masive[masive.length-1];
        System.out.println("minValue: " +minValue + " maxValue: " + maxValue);





    }


    }



