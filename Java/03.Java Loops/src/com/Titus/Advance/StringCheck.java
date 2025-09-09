package com.Titus.Advance;

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter ");
        char c = input.next().trim().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Its a vowel.");
        }
        else {
            System.out.println("Its a consonant.");
        }
    }
}
