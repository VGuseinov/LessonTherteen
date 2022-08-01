package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // final, null
        int d = 0;
        File f = null;  // null для ссылко это тоже самое что и для переменных 0
        int []arr = null;
        // final используется для задания константных либо неизменяемых конструкций
        final float PI = 3.1415f; // константа
        final Cat cat = new Cat();
        cat.age = 10;
        final Cat cat2 = new Cat();
        final int[] arr2 = {1, 2, 3};
        // переприсвоить память не возможно

    }
}
