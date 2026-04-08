package com.java.fundamentals;

import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Byte
        System.out.print("Enter age :");
        byte age = sc.nextByte();
        System.out.println("Age: " + age);

        //Short
        System.out.print("Enter Marks :");
        short marks = sc.nextShort();
        System.out.println("Marks: " + marks);

        //Int
        System.out.print("Enter Salary:");
        int salary = sc.nextInt();
        System.out.println("Salary: " + salary);

        //Long
        System.out.print("Enter Phone Number :");
        long phoneNO = sc.nextLong();
        System.out.println("Phone-Number: " + phoneNO);

        //Float
        System.out.print("Enter Discount Percentage:");
        float discountPercentage = sc.nextFloat();
        System.out.println("Discount Percentage: " + discountPercentage);

        //Double
        System.out.print("Enter Average Percentage:");
        double averageDiscount = sc.nextDouble();
        System.out.println("Average Discount: " + averageDiscount);

        //Char
        System.out.print("Enter Gender:");
        char gender = sc.next().charAt(0);
        System.out.println("Gender: " + gender);

        //Boolean
        System.out.print("Is Product Available (true / false ):");
        boolean isAvailable = sc.nextBoolean();
        System.out.println("Is Available: " + isAvailable);

        sc.close();

    }
}
