package com.example.lesson6;

public class InterfaseAbstrachion {

    public static void main(String[] args) {

    }
}
abstract class Bird{

    abstract void walk();

}
interface IFlyingBirg{
    void fly();
}

class Crow extends Bird implements IFlyingBirg{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}

class Papugai extends Bird  implements IFlyingBirg{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}
class Penguin extends Bird{

    @Override
    void walk() {

    }
}

