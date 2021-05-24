package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = in.nextLine();
        System.out.println("Ваше число: " + number);

        int lengthNumber = number.length();
        for (int i = 0; i < lengthNumber; i++){
            stack.push(number.charAt(i));
        }
        System.out.print("Ваше число в обратном порядке: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

        in.close();
    }
}
