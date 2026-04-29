package com.titus;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        int result = findCeilingNumber(arr, target);
        System.out.println(result);
    }

    private static int findCeilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }

        return arr[start];
    }
}
