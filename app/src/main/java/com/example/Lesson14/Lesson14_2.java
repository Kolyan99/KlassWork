package com.example.Lesson14;

public class Lesson14_2 {
    public static void main(String[] args) {
        //  Synchronized метод
        CountThread1 countThread1 = new CountThread1();

        Thread thread1 = new Thread(countThread1);
        thread1.start();

        Thread thread2 = new Thread(countThread1);
        thread2.start();

    }
}

class CountThread1 implements Runnable{

    private int count = 0;

    synchronized void changeValue(){
        for(int i=0; i<10; i++) {
            count++;
            System.out.print(count + " ");
        }
    }

    @Override
    public void run() {
        changeValue();
        }
    }

