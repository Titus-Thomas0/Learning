package com.titus;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark");
        int mark = input.nextInt();

        String grade = grade(mark);
        System.out.println("Your grade is " + grade);
    }

    public static String grade(int mark) {
        if (mark > 91 && mark <= 100) return "AA";
        if (mark > 81 && mark <= 90) return "AB";
        if (mark > 71 && mark <= 80) return "BB";
        if (mark > 61 && mark <= 70) return "BC";
        if (mark > 51 && mark <= 60) return "CD";
        if (mark > 41 && mark <= 50) return "DD";
        return "Fail";
    }
}
