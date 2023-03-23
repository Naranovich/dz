package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку текста");
        String [] strngs = scan.nextLine().split(" ");
        System.out.println("Исходный массив: " + Arrays.toString(strngs));
        Arrays.sort(strngs, Comparator.comparing(String::length));
        System.out.println("Сортированный: " + Arrays.toString(strngs));
    }
}