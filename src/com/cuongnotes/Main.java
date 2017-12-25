package com.cuongnotes;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Stack
        long startTime = System.nanoTime();
        devidedNumberToBinary(1000000000);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Total time: " + duration);

        // Recursive

        long startTime1 = System.nanoTime();
        convertA(10);
        long endTime1 = System.nanoTime();

        long duration1 = endTime1 - startTime1;
        System.out.println("Convert A: " + duration1);

    }
    public static void devidedNumberToBinary(int number) {
        // If you want to use self-stack not use Stack in java.util use MyStack

//        MyStack myStack = new MyStack(4);

        //Use stack in java util
        Stack myStack = new Stack();
        while (number > 0) {
            myStack.push(number % 2);
            System.out.println("Push value to stack " + (number % 2));
            number = number / 2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
        System.out.print("\n");

    }

    //Build recursive

    public static void convertA(int a) {

        int b = a / 2;
        int c = a % 2;
        if (b > 0) {
            convertA(b);
        }
        System.out.print(c);

    }
}
