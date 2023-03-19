package org.example;

import java.util.Scanner;

public class task6 {

        public static void main(String[] args) {
            int n = 0;
            String textDigits = "";
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите свой текст: ");
            String self = sc.nextLine();

            for (char ch : self.toCharArray()) {
                if ( Character.isLetterOrDigit(ch) ) {
                    textDigits = textDigits + ch;
                }else{
                    n++;
                }
            }
            System.out.println("Количество других символов: " + n);
            System.out.println( textDigits );
        }
    }
