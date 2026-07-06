package com.Titus.Advance;

public class OutingPlan {
    public static void main(String[] args) {
        int startDay = 1;
        int endDay = 31;
        int count = 0;
        for (int i = startDay; i <= endDay; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("In the month of august kunal can go out for " + count + " days");
    }

}
