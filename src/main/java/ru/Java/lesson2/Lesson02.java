package ru.Java.lesson2;

public class Lesson02 {

    public static int valueFromClass = 987;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        result = (a >b) ? a : b; // тернарный оператор
        result = (a > b) ? doSomething1() : doSomething2();
        System.out.println("Result " + result);

        String nameLetter = "Mariyaa";

        if (nameLetter == "Boris"){
            System.out.println("Give letter to Boris");
        } else if (nameLetter == "Olga"){
            System.out.println("Give letter to Olga");
        } else if (nameLetter == "Mariya" ) {
            System.out.println("Give letter to Mariya");
        } else {
            System.out.println("Go out office");
        }
        System.out.println("****************");
        switch (nameLetter){
            case "Boris" :
                System.out.println("Give letter to Boris");
                break;
            case "Olga" :
                System.out.println("Give letter to Olga");
                break;
            case "Mariya" :
                System.out.println("Give letter to Mariya");
                break;
            default:
                System.out.println("Go out office");
        }
        System.out.println("************");

        String  value = "Value";

        for (int i = 0; i < 10; i++){
            System.out.print(value + i + " ");
        }

        System.out.println("************");

        System.out.println(myMath(2,10));

        myPifagorTable(10,10);


        System.out.println("**********************");


        int a1 = 0;
        while (a1 < 10){
        a1++;
        if (a1 == 5 || a1 == 7){
            continue;
        }
        System.out.print(a1 + " | ");}


        System.out.println("**************");


        int c = 0;
        do {
            c++;
            if(c == 6){
                break;
            }
            System.out.print(c + " | ");
        }while (c < 10);


    }

    public static int myMath (int baseValue, int signature){
        int result= 1;
        for (int i = 0; i < signature; i++) {
            result = result * baseValue;
        }
        return result;
    }

     public static int doSomething1 (){
        return 15;
     }

    public static int doSomething2 (){
        return 24;
    }


    public static void myPifagorTable( int width, int height){
        for (int y = 1; y < height ; y++) {
            for (int x = 1; x <width ; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();

        }
    }
}
