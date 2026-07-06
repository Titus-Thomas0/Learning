package com.Titus.Advance;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = input.nextInt();
        int reverseNum = reverseNumber(number);
        if (number == reverseNum) {
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("Its not palindrome");
        }
    }
    public static int reverseNumber(int num) {
        int reverseNum = 0;
        int x = num;
        while (x != 0) {
            int digit = x % 10;
            reverseNum = (reverseNum * 10) + digit;
            x /= 10;
        }
        return reverseNum;
    }
}
