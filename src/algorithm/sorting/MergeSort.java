/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.sorting;

import java.util.Arrays;

/**
 *
 * @author mvoctavianojr
 */
public class MergeSort {
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 

    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged 
        int leftSize = m - l + 1;
        int rightSize = r - m;

        /* Create temp arrays */
        int leftPart[] = new int[leftSize];
        int rightPart[] = new int[rightSize];

        /*Copy data to temp arrays*/
        for (int counter = 0; counter < leftSize; ++counter) {
            leftPart[counter] = arr[l + counter];
        }
        for (int counter = 0; counter < rightSize; ++counter) {
            rightPart[counter] = arr[m + 1 + counter];
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays 
        int counter = 0, anotherCounter = 0;

        // Initial index of merged subarry array 
        int index = l;
        while (counter < leftSize && anotherCounter < rightSize) {
            if (leftPart[counter] <= rightPart[anotherCounter]) {
                arr[index] = leftPart[counter];
                counter++;
            } else {
                arr[index] = rightPart[anotherCounter];
                anotherCounter++;
            }
            index++;
        }

        /* Copy remaining elements of L[] if any */
        while (counter < leftSize) {
            arr[index] = leftPart[counter];
            counter++;
            index++;
        }

        /* Copy remaining elements of R[] if any */
        while (anotherCounter < rightSize) {
            arr[index] = rightPart[anotherCounter];
            anotherCounter++;
            index++;
        }
    }

    // Main function that sorts arr[l..r] using 
    // merge() 
    static void sort(int arr[], int left, int right) {
        if (left < right) {
            // Find the middle point 
            int midPoint = (left + right) / 2;

            // Sort first and second halves 
            sort(arr, left, midPoint);
            sort(arr, midPoint + 1, right);

            // Merge the sorted halves 
            merge(arr, left, midPoint, right);
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
