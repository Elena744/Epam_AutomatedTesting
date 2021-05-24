package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean brackets(String string) {
        Stack<Character> stack = new Stack<>();
        char symbol;

        for (int i = 0; i < string.length(); i++){
            symbol = string.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            } else {
                switch (symbol) {
                    case ']':
                        if (stack.empty() || stack.pop() != '[')
                            return false;
                        break;
                    case  '}':
                        if (stack.empty() || stack.pop() != '{')
                            return false;
                        break;
                    case ')':
                        if (stack.empty() || stack.pop() != '(')
                            return false;
                        break;
                    default:{}
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        System.out.println("Ваша строка: " + string);
        System.out.print("Скобки расставлены: " + brackets(string));
        in.close();
    }
}
