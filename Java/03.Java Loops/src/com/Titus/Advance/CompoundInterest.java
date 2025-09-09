package com.Titus.Advance;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle amount ");
        int principleAmount = input.nextInt();
        System.out.println("Enter the rate of interest ");
        double rateOfInterest = input.nextInt();
        System.out.println("Enter the no of times compounding per year(n) ");
        int compoundingPerYear = input.nextInt();
        System.out.println("Enter the no of years(t) ");
        int noOfYears = input.nextInt();
        double compoundInterest = principleAmount * (Math.pow((1 + rateOfInterest / compoundingPerYear), (compoundingPerYear * noOfYears)));
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
