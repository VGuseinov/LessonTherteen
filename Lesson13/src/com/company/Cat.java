package com.company;

public final class Cat { // классы final нельзя наследовать
    public int age;
    public final int pawCount = 4;

    public final void meow() {
        System.out.println("meow-meow");
    }

    public void eat(String food) {
        if (food.equals("chocolate")) {
            // специально ломаем программу
            // (генерируем исклоючение)
            MyRunTimeException e = new MyRunTimeException();
            throw e;
        }
        System.out.println("кот съел " + food);
    }

    public void drink(String drink) throws MyException {
        if (drink.equals("alchohol")) {
            MyException e = new MyException();
            throw e;
        }
        System.out.println("кот выпил " + drink);
    }
}

