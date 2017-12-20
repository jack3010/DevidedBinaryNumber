package com.cuongnotes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.devidedNumberToBinary(10);

    }
    public void devidedNumberToBinary(int number) {
        MyStack myStack = new MyStack(100);
        number = number / 2;
        if (number % 2 == 0) {

        } else {

        }

        System.out.println(number);
    }

}
