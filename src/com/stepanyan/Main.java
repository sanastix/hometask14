package com.stepanyan;

import java.lang.reflect.*;

public class Main {

    /*
    Написать класс в котором есть 4 метода: +-/*
    Которые принимают 2 параметра типа int.
    Нужно написать метод, который по строковому имени метода найдет его и вызовет, при помощи Reflection.
    Если такого метода нет выдать ошибку.
     */

    public static void main(String[] args) {

        findMethod();

    }

    private static void findMethod() {

        Mathematician math = new Mathematician();
        Class <? extends Mathematician> mathClass = math.getClass();

        try {
            Method mathMethod = mathClass.getDeclaredMethod("multiplication", int.class, int.class);
            System.out.println(mathMethod.invoke(math, 8,9));
        } catch (NoSuchMethodException e1) {
            System.out.println("There's no such method");
        } catch (IllegalAccessException e2) {
            System.out.println("Access denied");
        } catch (InvocationTargetException e3) {
            System.out.println("Target can't be invoked");
        }

    }

}
