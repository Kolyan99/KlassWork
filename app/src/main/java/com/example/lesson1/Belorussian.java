package com.example.lesson1;

public class Belorussian {
    public static void main(String[] args) {
        Belorussian belorussian = new Belorussian();
        German german = new German();

        belorussian.speakLanguage();

    }

    void speakLanguage(){
        System.out.println("speak german Language");

    }
}
class German extends Human{

    void speaLanguage(){

    }
}


abstract class Human{
    abstract void speakLanguage();
}


