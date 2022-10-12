package com.example.lesson8;



public class lesson8_3 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try {
            shop.setAge(12);
        } catch (CantSellToChildException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(shop.getAge());
        }
    }
}

class Shop {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws CantSellToChildException {
        if (age < 18) {
            throw new CantSellToChildException("you are a child, can't sell vodka to you");
        } else {
            this.age = age;
            System.out.println("alcohol sold");
        }
    }
}

class CantSellToChildException extends Exception {

    private String message;

    CantSellToChildException(String message) {
        this.message = message;
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
