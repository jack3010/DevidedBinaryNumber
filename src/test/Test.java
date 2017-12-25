/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Stack;

/**
 *
 * @author Quan
 */
public class Test {

    public static void main(String[] args) {
        convertA(4);
    }

    public static void convertA(int a) {
        long startTime = System.nanoTime();
        int b = a / 2;
        int c = a % 2;
        if (b > 0) {
            convertA(b);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Convert A: " + duration);
    }

    public static void convertB(int a) {
        long startTime = System.nanoTime();
        Stack stack = new Stack();
        while (a > 0) {
            stack.push(a);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Convert A: " + duration);
    }

}
