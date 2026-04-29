package com.titus;

public class Sample {
    public static void main(String[] args) {
        int length = 2909;
        int width = 3968;
        int height = 3272;
        int mass = 729;
        String result = solution(length, width, height, mass);
        System.out.println(result);
    }

    public static String solution(int length, int width, int height, int mass) {
        if (checkBulky(length, width, height) && checkHeavy(mass)) return "Both";

        if (checkBulky(length, width, height)) return "Bulky";

        if (checkHeavy(mass)) return "Heavy";

        return "Neither";
    }

    static boolean checkBulky(int length, int width, int height) {
        long volume = (long) length * width * height;
        return length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000;
    }

    static boolean checkHeavy(int mass) {
        return mass >= 100;
    }
}
