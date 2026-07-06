package com.Titus;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (n > 0) {
            System.out.print(n1 + " " + n2 +" ");
            for (int i = 0; i < n - 2; i++) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(n3 + " ");
            }
        }
    }
}
