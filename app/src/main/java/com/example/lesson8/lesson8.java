package com.example.lesson8;

public class lesson8 {

    public static void main(String[] args) {
        try {
            getWrongValue(null);
        } catch (ArithmeticException e) {
            System.out.println("caught arithmetic");
        } catch (NullPointerException e) {
            System.out.println("caught nullPointException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("caught indexOutOfBound");
        } finally {
            System.out.println("do if success or exception thrown");
        }
    }

    static void getWrongValue(Integer value) {
        System.out.println(value.toString());
    }
}
