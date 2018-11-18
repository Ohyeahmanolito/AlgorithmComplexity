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
public class RecurBubbleSort {

    // A function to implement bubble sort 
    static void bubbleSort(int arr[], int n) {

        if (n == 1) {
            System.out.println("done");
        } else {

            for (int counter = 0; counter < n - 1; counter++) {
                if (arr[counter] > arr[counter + 1]) {
                    int temp = arr[counter];
                    arr[counter] = arr[counter + 1];
                    arr[counter + 1] = temp;
                }
            }
            bubbleSort(arr, n - 1);
        }
    }

    // Driver Method 
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr, arr.length);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }

}
