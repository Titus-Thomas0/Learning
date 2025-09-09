package com.Titus.Basics;

import java.util.Scanner;

public class SumAllInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int num = input.nextInt();
            if (num != 0) {
                sum += num;
            }
            else {
                System.out.print(sum);
                break;
            }
        }
    }
}
