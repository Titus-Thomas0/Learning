package com.Titus.Advance;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string ");
        String word = input.next();
        int wordLength = word.length();
        StringBuilder reverseWord = new StringBuilder();
        for (int i = wordLength - 1; i >= 0; i--) {
            char s = word.charAt(i);
            reverseWord.append(s);
        }
        System.out.println("Reversed string = " + reverseWord);
    }
}
