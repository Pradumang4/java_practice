package com.ok.dailyRevise;

import java.util.*;

public class OOP {

    static int sum(int a, int b) {
        return a + b;
    }

    static String table(int a, int b) {
        return (a + "X" + b + "=" + a * b);
    }


    public static void main(String[] args) {
        String name = "demo";
        int age = 20;
        System.out.println("My name is " + name + " and my age is " + age);
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter your number");
        //  int age2 =in.nextInt();
        //for (int i=1;i<11;i++){
        //     System.out.println(age2+" X "+i+ "="+age2*i);
        //  }

        int res = sum(8, 9);
        System.out.println(res);

        int num1 = 2;
        for (int i = 1; i < 11; i++) {
            String tab = table(num1, i);
            // System.out.println(tab);
        }

//        class student {
//            String name;
//            int age;
//
//            void getdetails() {
//                System.out.println("Name:" + name + " Age:" + age);
//            }
//        }
//        student s1 = new student();
//        s1.name = "Ram";
//        s1.age = 20;
//        s1.getdetails();
//        student s2 = new student();
//        System.out.println("Enter name of student\n");
//        s2.name = in.nextLine();
//        System.out.println("Enter age of student\n");
//        s2.age = in.nextInt();
//        s2.getdetails();
        class car {
            String Cbrand;
            int Cspeed;

            car(String brand,int speed) {
                Cbrand=brand;
               Cspeed=speed;


            }

            void getcardetails() {
                System.out.println("Car's Brand: " + Cbrand + " & Cars's top speed is: " + Cspeed);
            }
        }

        car car1 = new car();
        System.out.println("Enter car brand\n");
        car1.Cbrand = in.nextLine();
        System.out.println("Enter car speed\n ");
        car1.Cspeed = in.nextInt();
        car1.getcardetails();

        car car2 = new car();
        car2.Cbrand = "Audi";
        car2.Cspeed = 780;
        car2.getcardetails();

        car car3 = new car("Benz", 780);


    }

}

