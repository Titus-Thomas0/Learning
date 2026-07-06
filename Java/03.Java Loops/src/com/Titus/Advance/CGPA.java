package com.Titus.Advance;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total grade points for all credits ");
        int totalGrade = input.nextInt();
        System.out.println("Enter the total credit for all courses ");
        int totalCredit = input.nextInt();
        double cgpa = (double) totalGrade / totalCredit;
        System.out.println("CGPA = " + cgpa);
    }
}
