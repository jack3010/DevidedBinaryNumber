package com.cuongnotes;

public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        stackArray[++top] = j;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }
}
