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
public class InsertionSort {

    static void sort(int arr[]) {
        int n = arr.length;
        for (int indexCounter = 1; indexCounter < n; ++indexCounter) {
            int key = arr[indexCounter];
            int leftIndex = indexCounter - 1;

            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (leftIndex >= 0 && arr[leftIndex] > key) {
                arr[leftIndex + 1] = arr[leftIndex];
                leftIndex = leftIndex - 1;
            }
            arr[leftIndex + 1] = key;
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
