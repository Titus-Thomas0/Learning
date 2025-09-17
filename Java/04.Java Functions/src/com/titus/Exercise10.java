package com.titus;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (isPalindrome(num)) System.out.println("Its palindrome");
        else System.out.println("Its not palindrome");
    }

    private static boolean isPalindrome(int num) {
        int x = num;
        int reverseNum = 0;
        while (x != 0) {
            int digit = x % 10;
            reverseNum = (reverseNum * 10) + digit;
            x /= 10;
        }

        return num == reverseNum;
    }
}
