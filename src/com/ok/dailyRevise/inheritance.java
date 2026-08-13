package com.ok.dailyRevise;

public class inheritance {
    static class animal{
        void eat(){
            System.out.println("Animal is eating");
        }
    }
    static class dog extends animal{
        void bark(){
            System.out.println("Dog is barking");

        }
    }

    public static void main(String[] args) {
        dog d1=new dog();
        d1.eat();
        d1.bark();

    }
}
