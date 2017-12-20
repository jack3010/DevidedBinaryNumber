package com.cuongnotes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.devidedNumberToBinary(10);

    }
    public void devidedNumberToBinary(int number) {
        MyStack myStack = new MyStack(100);
        while (number > 0) {
            myStack.push(number % 2);
            System.out.println("Push value to stack " + (number %2));
            number = number / 2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }

}
