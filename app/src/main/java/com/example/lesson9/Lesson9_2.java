package com.example.lesson9;

import java.util.Arrays;

public class Lesson9_2 {
    public static void main(String[] args) {
        int massive[]= {1,5,-3,17,3,2,13};
        boolean isSorted = false;
        int buffer;
        System.out.println(Arrays.toString(massive));

        while (isSorted==false){
            isSorted = true;
            for(int i=0; i<massive.length-1; i++){
                if(massive[i]>massive[i+1]){
                    isSorted = false;

                    buffer = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = buffer;
                }
            }
            System.out.println(Arrays.toString(massive));
        }
    }
}
