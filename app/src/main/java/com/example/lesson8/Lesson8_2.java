package com.example.lesson8;

import java.io.FileNotFoundException;

public class Lesson8_2 {
    public static void main(String[] args) {

        try {
            throwUnCheckedException();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            throwCheckedException();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

static void throwUnCheckedException() throws NullPointerException{
        throw new NullPointerException("runTime");
}
    static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException("compileTime");
    }

}
