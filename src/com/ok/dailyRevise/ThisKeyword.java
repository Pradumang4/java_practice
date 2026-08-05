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
    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword("Rahul",22);
        obj.display();
    }
}
