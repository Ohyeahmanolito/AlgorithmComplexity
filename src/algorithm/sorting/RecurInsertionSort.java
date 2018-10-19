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
public class RecurInsertionSort {

    static void insertionSortRecursive(int arr[], int indexCounter) {
        // Base case 
        if (indexCounter <= 1) {
            return;
        }

        // Sort first n-1 elements 
        insertionSortRecursive(arr, indexCounter - 1);

        int last = arr[indexCounter - 1];
        int counter = indexCounter - 2;

        /* Move elements of arr[0..i-1], that are 
          greater than key, to one position ahead 
          of their current position */
        while (counter >= 0 && arr[counter] > last) {
            arr[counter + 1] = arr[counter];
            counter--;
        }
        arr[counter + 1] = last;
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        insertionSortRecursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
