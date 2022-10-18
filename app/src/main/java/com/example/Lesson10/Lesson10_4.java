package com.example.Lesson10;

public class Lesson10_4 {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9}
                }
        };

        for (int numbers2D = 0; numbers2D < numbers.length; numbers2D++){
            for(int numbers1D = 0; numbers1D < numbers[numbers2D].length; numbers1D++){
                for(int nubers1 = 0; nubers1 < numbers[numbers2D][numbers1D].length; nubers1++){
                    System.out.print(numbers[numbers2D][numbers1D][nubers1] + "\t" );
                }
                System.out.println();
            }
        }
    }
}
