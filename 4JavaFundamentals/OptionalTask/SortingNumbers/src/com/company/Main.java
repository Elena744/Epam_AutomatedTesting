package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    /*Ввести n чисел с консоли.
    1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    2.     Вывести числа в порядке возрастания (убывания) значений их длины.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxLenghtNumber = 0;
        int minLenghtNumber = 0;

        System.out.print("Введите количество чисел: ");
        int count = in.nextInt();
        String[] numbers = new String[count];

        System.out.print("Введите числа через пробел: ");
        for (int i = 0; i < count; i++){
            numbers[i] = in.next();
        }
        in.close();

        Stream<String> sortedNumbers = Arrays.stream(numbers).sorted((e1, e2) -> e1.length() - e2.length());
        numbers = sortedNumbers.toArray(String[]::new);
        System.out.println(Arrays.toString(numbers));
        for (String s : numbers)
            System.out.print(s + " ");
        System.out.println("\nсамое короткое число: " + numbers[0] + ", длина числа: " + numbers[0].length());
        System.out.println("самое длинное число: " + numbers[count - 1] + ", длина числа: " + numbers[count - 1].length());

        //Arrays.stream(numbers).sorted((e1, e2) -> e1.length() - e2.length()).forEach(s -> System.out.print(s + " "));
        //System.out.println(Arrays.stream(numbers).sorted((e1, e2) -> e1.length() - e2.length()).findFirst().orElse("empty").toString());
        //System.out.println(Arrays.stream(numbers).sorted((e1, e2) -> e1.length() - e2.length()).skip(sortedNumbers.count() - 1).findAny().orElse("empty").toString());
    }
}
