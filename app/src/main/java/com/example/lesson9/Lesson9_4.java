package com.example.lesson9;

import java.util.Scanner;

public class Lesson9_4 {

    // enter value from console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number: " );
        if(scanner.hasNextInt()) {
            int eneteredValue = scanner.nextInt();
            System.out.println("You values is: " + eneteredValue);
        }else {
            System.out.println("You inout value is wrong... hello");
        }
    }
}
