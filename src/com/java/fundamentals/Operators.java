package com.java.fundamentals;

public class Operators {
    static void main(String[] args) {
        byte no1 = 14;
        byte no2 ;
        no2 = no1;
        System.out.println(no2);
        int res = 10 + (20 - 30) * 40 / 50 % 60;
        System.out.println(res);
        //Pre & Post increment
        int num1 = 10;
        int num2 =20;
        int value = --num1 + ++num1 - num1-- + num1++ - --num2 + ++num2;
        System.out.println(value);

        if(num1 >= 10 && num2 <=20){
            System.out.println("true");
        }
          if(num1 >=10 || num2 <=20){
              System.out.println("false");
          }
    }
}
