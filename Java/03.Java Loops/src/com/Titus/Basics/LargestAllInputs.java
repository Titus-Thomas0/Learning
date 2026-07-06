package com.Titus.Basics;

import java.util.Scanner;

public class LargestAllInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;

        while (true) {
            int num = input.nextInt();
            if (num != 0) {
                if (largest < num) {
                    largest = num;
                }
            }
            else {
                System.out.print(largest);
                break;
            }
        }
    }
}
