package com.Titus.Advance;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the runs scored ");
        int runsScored = input.nextInt();
        System.out.println("Enter the timeouts ");
        int timeout = input.nextInt();
        int averageBatting = runsScored / timeout;
        System.out.println("Batting Average = " + averageBatting);
    }
}
