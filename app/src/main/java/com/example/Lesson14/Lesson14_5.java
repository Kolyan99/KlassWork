package com.example.Lesson14;

public class Lesson14_5 {
    public static void main(String[] args) {
        ThreadClass2 threadClass2 = new ThreadClass2();
        threadClass2.setDaemon(true);
        threadClass2.start();

    }
}

class ThreadClass2 extends Thread{
    @Override
    public void run() {
        System.out.println("I a'm a daemon thread " + Thread.currentThread().isDaemon());
    }
}
