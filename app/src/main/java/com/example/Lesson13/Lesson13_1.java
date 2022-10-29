package com.example.Lesson13;

public class Lesson13_1 {
    public static void main(String[] args) {
        // 2 Способ переопределения потока
        TreadClass3 treadClass3 = new TreadClass3() {
            @Override
            public void run() {
                System.out.println("Run in Thread in anonym class");
            }
        };

        treadClass3.start();

        // 3 метод создания потока
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("I'm running in thread");
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running in runnable");
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}



class TreadClass3 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class TreadClass4 implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}
