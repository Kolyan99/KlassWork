package com.example.lesson6;

public class Lesson6_2 {
    public static void main(String[] args) {

        Button button = new Button(new LoginClickListener());
        button.buttonClicked();
    }
}

class LoginClickListener implements IAutoriz{

    @Override
    public void sendLoginRequest() {
        System.out.println("Login request was successfully sent...");
    }
}

interface  IAutoriz{

    void sendLoginRequest();
}

class Button{

    IAutoriz isAuthorization;

    public Button(IAutoriz action){
        this.isAuthorization = action;
    }

    void buttonClicked(){
        isAuthorization.sendLoginRequest();
    }
}