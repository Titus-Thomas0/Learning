package com.titus;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = findMax(arr, i);
            if (arr[maxIndex] != arr[i]) {
                swap(arr, maxIndex, i);
            }
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static int findMax(int[] arr, int end) {
        int max = 0;

        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
