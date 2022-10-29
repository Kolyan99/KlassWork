package com.example.Lesson13;

public class Lesson13 {
    public static void main(String[] args) {
// 1 способ названия потоков
        TreadClass1 treadClass1 = new TreadClass1();
        treadClass1.start();

        TreadClass2 treadClass2 = new TreadClass2();
        Thread thread1 = new Thread(treadClass2);
        thread1.start();

    }
}

class TreadClass1 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class TreadClass2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}


