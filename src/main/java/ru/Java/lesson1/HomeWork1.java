package ru.Java.lesson1;

public class HomeWork1 {
    public static void main (String[] args){
        checkSumSign(10, -30);
        printColor(100);
        compareNumbers(1, -100);
    }

    public static void checkSumSign(int a, int b){
        int c = a + b;
        if (c >= 0)
        {System.out.println("Сумма положительная");}
        else if (c < 0) {
            System.out.println("Сумма отрицательная");}
    }

    public static void printColor(int value){
        if (value <= 0 )
        {System.out.println("Красный");}
        if (value >0 && value <= 100) {
            System.out.println("Желтый");}
        if (value !=100 || value > 100){
                System.out.println("Зеленый");}
            }


    public static void compareNumbers(int a, int b) {
            if (a >= b) {
            System.out.println("a>=b");
            if ( a < b) {
                System.out.println(" a<b");
            }
        }

    }

 }

