package com.company;

import java.io.File;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        // исключения - Exceptions
        // Исключения это непредвиденная ситуация связанная с ошибкой в коде
        // которая ведет к принудительному завершению приложения
        // int a = 1 / 0;
//        Cat cat = new Cat();
//        Object o = cat;
//        String s = (String)o;
//        int []arr = {1, 2, 3};
//        arr[3] = 67;

        // try-catch-finally
        try {
            // любой код, выполнение которого потециально может привести к ошибке
            int []arr = {};
            arr[10] = 9;
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("исправь ошибку");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("я выполнюсь в любом случае");
        }
        System.out.println("im alive");

        // все классы которые наследуют класс Exception называют проверяемыми (Checked)
        // все классы которые наследуют класс RunTimeException называют непроверяемыми (unChecked)
        File f = new File("1.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Cat cat = new Cat();
        try {
            cat.eat("fish");
            cat.eat("milk");
            cat.eat("meat");
            cat.eat("chocolate");
        } catch (MyRunTimeException e) {
            e.printStackTrace();
        }

        try {
            cat.drink("alchohol");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}