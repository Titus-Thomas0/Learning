package com.titus;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int result = findFloorNumber(arr, target);
        System.out.println(result);
    }

    private static int findFloorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

        return arr[end];
    }
}
