package com.example.lesson6;

public class Lesson7 {
    static IRepository iPepository = new RepositoryImpl(){

        public void login(String userName, String password){
            System.out.println("hello");
        }

    };

    static Anonym anonym = new Anonym(){
        @Override
        void hackNetwork() {
            //super.hackNetwork();
            System.out.println("child haced world");
        }
    };


    public static void main(String[] args) {
        String password = null;
        iPepository.login("user name", password);
        anonym.hackNetwork();
    }

}
class Anonym{

    void hackNetwork(){
        System.out.println("I haced the world");
    }
}
