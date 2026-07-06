package com.Titus;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        String word = input.next();
        if (word.isBlank()) {
            System.out.println("Enter a valid word");
        }
        else {
            String reverseWord = reverse(word);
            System.out.println(reverseWord);
            if (isPalindrome(word, reverseWord)){
                System.out.println("String is palindrome");
            }
            else {
                System.out.println("String is not palindrome");
            }
        }
    }

    public static String reverse(String word) {
        int length = word.length();
        StringBuilder reverseWord = new StringBuilder();
        for (int i = length - 1 ; i >= 0; i--) {
            char s = word.charAt(i);
            reverseWord.append(s);
        }
        return reverseWord.toString();
    }

    public static boolean isPalindrome(String word, String reverseWord) {
        int length1 = word.length();
        int length2 = reverseWord.length();
        if (length1 == length2) {
            int i = 0;
            while (i < length1) {
                if (word.charAt(i) == reverseWord.charAt(i)) {
                   i++;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
