package com.Titus.Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of n ");
        int n = input.nextInt();
        int s = 0;
        int s1 = 1;

        System.out.print(s + " " + s1 +" ");
        int count = 2;
        while (count < n) {
            int temp = s1;
            s1 += s;
            s = temp;
            System.out.print(s1 + " ");
            count++;
        }
    }
}
