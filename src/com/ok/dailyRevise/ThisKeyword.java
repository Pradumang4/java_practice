package com.ok.dailyRevise;

public class ThisKeyword {
    String name;
    int age;
    ThisKeyword(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }
     static class mobile{
        void ring(){
            System.out.println("Phone is ringing");
        }
        void call(){
            this.ring();
        }

    }
    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword("Rahul",22);
        obj.display();
        mobile m=new mobile();
        m.call();
    }






}


