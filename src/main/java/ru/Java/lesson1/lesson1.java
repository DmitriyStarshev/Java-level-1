package ru.Java.lesson1;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello_Word");

        String myString1 = "Hello_Java";
        String myString2 = "Hello_MyWorld";
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString1 + myString2);

        // Целочисленные
        byte myByte = 50; // -128...+127 (1 byte)
        short myShort = 500; // -32768..+32767 (2 byte)
        int myInteger = 5269032; // - 2.1 млрд... +2.1 млрд (4 byte)
        long myLong = 3000000000L; //-2^63 ...+2^63 (8 byte)

        // С плавающей точкой
        float myFloat = 356.555F; //(4 byte) .0000000 7 нулей после точки
        double myDouble = 356.55; //(8 byte) .00000000000000 14 нулей после точки

        // символы
        char myChar= 'F'; //(Один символ)ASCII (2 byte)

        //boolean
        boolean myBoolean = true; //false

        int a = 45;
        int b = 55;
        int c= a + b;
        System.out.println(c);

        // Math-operation +, - , / , * , ^ , %
         int d= 15;
         int f= 4;
         int g= d % f;
        System.out.println(g);

        // условные выражения
        int age = 32;
        boolean less = age < 18;
        boolean more = age > 65;
        System.out.println(less);
        System.out.println(more);

        if (less){
            System.out.println( "Don't drink");
        } else if (more){
            System.out.println("Sorry, you old? go home!");
        } else {
            System.out.println("Good luck");}

        int abc = 9;
        if (abc < 10){
            System.out.println( abc + " < 10");
        }

        /*
        a= a + 1; -> a++
        a= a - 1; -> a--
        a= a + 45; a+= 45; (-=, *=, /=, %=)
         */
        int qwe = 100;
        int asd = 65;
        int result;

        result= myMath(qwe,asd);
        qwe++; //qwe = qwe + 1;
        result += myMath(qwe,asd);
        asd++;
        result += myMath(qwe,asd);
        qwe ++;
        result += myMath(qwe,asd);
        System.out.println(result);
    }

    public static int myMath(int value1, int value2){
        return value1 + value2;
    }


}


