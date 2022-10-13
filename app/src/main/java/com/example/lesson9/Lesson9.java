package com.example.lesson9;

import java.util.Arrays;

public class Lesson9 {

    public static void main(String[] args) {
        String[] massive = {"hello", "bye", "world"};
        int[] massive2 = new int[5];
        massive2[0] = 1;
        massive2[1] = 2;
        massive2[2] = 3;
        massive2[3] = 4;
        massive2[4] = 5;
        System.out.println(massive[0]);
        String[] massive3 = new String[]{"hlle", "bye", "world"};
        massive3 = new String[]{"hlle", "bye", "world", "country"};
        System.out.println(massive3[3]);

        int[] massive4 = new int[]{16,-17,22,0,1,33,5,4,7};
        for(int i = 0; i<massive4.length-1; i++) {
            System.out.print(massive4[i] + " ");
        }
            Arrays.sort(massive4);
        int index =  Arrays.binarySearch(massive4,5);
        System.out.println(index);
        System.out.println("\n");
        for(int i=0; i<=massive4.length-1; i++){
            System.out.print(massive4[i] + " ");
        }

        for( int i=0; i<massive4.length; i++ ){
            System.out.print(massive4[i]+ " ");
        }

        for(int element : massive4){
            System.out.print(element + " ");
        }
        System.out.println("\n");

        System.out.println(Arrays.toString(massive4));




        for(int i = 0; i<massive.length; i++){
            System.out.println(massive[i] +"\n");
        }

        for(int i = 0; i<massive2.length; i++){
            System.out.println(massive2[i] +"\n");
        }



    }
}
