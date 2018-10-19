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
public class BubbleSort {
    
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int counter = 0; counter < n - 1; counter++) {
            for (int anotherCounter = 0; anotherCounter < n - counter - 1; anotherCounter++) {
                if (arr[anotherCounter] > arr[anotherCounter + 1]) {

                    //Swapping the values
                    int temp = arr[anotherCounter];
                    arr[anotherCounter] = arr[anotherCounter + 1];
                    arr[anotherCounter + 1] = temp;
                }
                
            }
        }
    }
    
    static void efficientbubbleSort(int arr[]) {
        int counter, anotherCounter, temp;
        boolean swapped;
        int arrLength = arr.length;
        for (counter = 0; counter < arrLength - 1; counter++) {
            swapped = false;
            for (anotherCounter = 0; anotherCounter < arrLength - counter - 1; anotherCounter++) {
                if (arr[anotherCounter] > arr[anotherCounter + 1]) {
                    // swap arr[j] and arr[j+1] 
                    temp = arr[anotherCounter];
                    arr[anotherCounter] = arr[anotherCounter + 1];
                    arr[anotherCounter + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) {
                break;
            }
        }
    }
    
    public static void main(String args[]) {
//        Random rand = new Random();
//        for (int counter = 0; counter < 100000; counter++) {
//            System.out.print(rand.nextInt(100) + ",");
//        }
        int unSorted[] = {28, 74, 58, 61, 30, 74, 23, 43, 22, 53, 18, 21, 50, 82, 70, 3, 87, 1, 92, 48, 43, 46, 7, 6, 52, 8, 37, 7, 85, 81, 27, 7, 10, 83, 9, 21, 79, 48, 46, 40, 2, 31, 11, 70, 76, 74, 26, 44, 59, 9, 35, 25, 94, 89, 46, 73, 69, 6, 37, 99, 95, 19, 10, 82, 46, 67, 8, 65, 86, 9, 71, 70, 90, 61, 62, 8, 28, 46, 73, 50, 76, 73, 84, 44, 9, 88, 87, 26, 52, 85, 12, 48, 78, 18, 71, 16, 68, 53, 85, 88, 25, 96, 32, 71, 45, 82, 18, 67, 22, 82, 61, 93, 21, 90, 20, 92, 2, 13, 45, 13, 52, 89, 51, 53, 0, 63, 90, 9, 0, 41, 1, 98, 22, 62, 40, 97, 51, 19, 16, 66, 54, 58, 5, 29, 62, 42, 67, 98, 67, 78, 64, 74, 81, 11, 69, 96, 54, 26, 68, 26, 75, 59, 11, 5, 27, 99, 56, 27, 93, 22, 80, 70, 43, 85, 33, 83, 24, 28, 8, 18, 94, 12, 81, 30, 84, 5, 60, 65, 60, 7, 24, 61, 93, 48, 57, 98, 53, 3, 14, 40, 46, 33, 78, 62, 83, 8, 38, 33, 66, 41, 48, 43, 72, 50, 2, 75, 85, 57, 37, 93, 30, 69, 18, 15, 5, 63, 8, 99, 16, 10, 4, 86, 87, 99, 9, 63, 48, 31, 30, 80, 4, 78, 63, 9, 17, 46, 9, 98, 22, 99, 51, 7, 8, 81, 90, 45, 43, 68, 40, 80, 48, 35, 52, 0, 59, 53, 54, 16, 51, 25, 63, 45, 79, 52, 60, 77, 1, 58, 69, 95, 18, 9, 36, 60, 77, 43, 84, 69, 76, 56, 84, 52, 61, 11, 12, 77, 26, 45, 88, 58, 25, 40, 52, 90, 71, 35, 96, 3, 24, 43, 54, 66, 2, 85, 89, 52, 43, 35, 16, 20, 7, 82, 36, 0, 7, 98, 43, 7, 77, 93, 16, 72, 36, 86, 21, 44, 26, 41, 15, 54, 1, 33, 92, 20, 48, 90, 37, 54, 21, 41, 43, 43, 48, 50, 82, 56, 37, 28, 10, 89, 91, 93, 34, 71, 33, 24, 86, 48, 11, 60, 68, 98, 18, 63, 67, 35, 12, 53, 21, 15, 58, 52, 80, 28, 48, 56, 80, 30, 73, 28, 15, 15, 41, 27, 93, 42, 84, 66, 15, 72, 23, 35, 68, 36, 49, 43, 0, 56, 4, 17, 25, 70, 72, 93, 10, 61, 78, 73, 51, 41, 58, 35, 4, 0, 90, 89, 43, 62, 25, 87, 88, 98, 60, 46, 87, 68, 88, 15, 69, 76, 15, 46, 12, 83, 5, 12, 92, 88, 31, 4, 94, 87, 35, 29, 3, 66, 78, 82, 85, 94, 71, 21, 74, 48, 70, 46, 16, 97, 89, 64, 84, 53, 82, 52, 83, 84, 50, 21, 15, 63, 90, 25, 54, 24, 9, 98, 30, 76, 98, 95, 14, 51, 76, 74, 44, 76, 51, 14, 68, 24, 25, 77, 36, 92, 59, 43, 62, 50, 51, 32, 88, 56, 80, 44, 51, 37, 60, 2, 88, 10, 21, 70, 92, 73, 2, 59, 82, 16, 74, 74, 31, 12, 17, 76, 33, 22, 70, 16, 21, 32, 8, 0, 55, 29, 64, 50, 25, 10, 69, 96, 25, 68, 52, 9, 27, 31, 59, 35, 64, 94, 56, 38, 68, 6, 47, 11, 55, 61, 69, 26, 23, 59, 25, 2, 73, 48, 26, 30, 87, 50, 78, 97, 89, 46, 82, 56, 97, 21, 77, 12, 74, 89, 83, 47, 24, 81, 32, 99, 59, 79, 99, 30, 4, 62, 54, 86, 1, 47, 27, 21, 97, 53, 16, 33, 97, 36, 91, 61, 52, 88, 62, 68, 16, 4, 43, 44, 22, 22, 68, 48, 51, 27, 73, 62, 94, 10, 35, 55, 39, 29, 54, 85, 85, 76, 74, 68, 32, 10, 28, 46, 24, 16, 32, 20, 91, 61, 74, 57, 19, 96, 10, 73, 49, 92, 33, 56, 91, 10, 67, 55, 15, 65, 11, 28, 37, 95, 18, 61, 73, 24, 88, 94, 79, 16, 92, 40, 66, 67, 59, 47, 99, 56, 12, 68, 64, 52, 35, 68, 51, 36, 48, 68, 97, 97, 31, 13, 13, 29, 67, 2, 58, 55, 36, 58, 47, 73, 30, 79, 40, 37, 11, 68, 82, 38, 25, 15, 40, 1, 30, 48, 84, 12, 92, 51, 34, 32, 82, 49, 99, 47, 68, 93, 2, 5, 15, 36, 20, 50, 54, 63, 67, 77, 12, 63, 63, 37, 16, 79, 85, 45, 46, 58, 88, 31, 41, 20, 60, 62, 10, 7, 41, 84, 71, 90, 74, 47, 1, 62, 68, 96, 64, 98, 35, 18, 58, 85, 67, 65, 43, 16, 79, 95, 28, 81, 59, 61, 29, 2, 73, 23, 61, 11, 75, 49, 98, 51, 16, 81, 47, 23, 65, 50, 91, 93, 22, 64, 72, 40, 1, 19, 96, 57, 79, 90, 83, 82, 98, 53, 37, 11, 92, 46, 47, 21, 95, 37, 82, 86, 82, 83, 65, 84, 3, 65, 89, 32, 81, 99, 14, 31, 34, 47, 16, 91, 19, 88, 75, 71, 81, 39, 49, 97, 17, 61, 83, 73, 43, 37, 40, 21, 10, 62, 5, 24, 47, 72, 84, 22, 65, 95, 81, 38, 66, 36, 91, 54, 93, 48, 29, 54, 8, 72, 89, 89, 84, 87, 25, 24, 51, 84, 94, 61, 58, 60, 33, 27, 37, 64, 42, 4, 33, 36, 56, 41, 57, 10, 13, 90, 72, 94, 81, 82, 2, 52, 17, 74, 65, 16, 90, 34, 69, 71, 61, 13, 37, 26, 29, 45, 29, 68, 69, 14, 37, 42, 23, 29, 82, 43, 54, 71, 36, 50, 49, 8, 24, 6, 5, 2, 17, 20, 49, 37, 67, 45, 37, 72, 7, 61, 44, 91, 34, 37, 46, 68, 9, 13, 43, 65, 18, 12, 38, 64, 61, 16, 83, 23, 66, 47, 29, 19, 83, 99, 19, 23, 41, 71, 61, 93, 9, 35, 50, 88, 45, 87, 58, 58, 97, 69, 71, 14, 48, 47, 9, 78, 80, 84, 95, 59, 39, 38, 80, 58, 15, 97, 91, 7, 44, 21, 71, 49, 61, 54, 64, 76, 14, 93, 67, 59, 77, 94, 32, 42, 45, 8, 18, 65, 3, 90, 72, 20, 24, 96, 48, 35, 80, 82, 73, 81, 8, 82, 70, 20, 9, 20, 41, 23, 12, 39, 30, 40, 18, 64, 29, 35, 77, 38, 27, 69, 12, 18, 54, 79, 20, 28, 19, 85, 33, 7, 58, 30, 49, 98, 69, 46, 68, 51, 22, 66, 44, 82, 27, 65, 95, 55, 63, 24, 83, 90, 67, 94, 50, 20, 22, 51, 60, 67, 42, 10, 95, 78, 73, 92, 18, 26, 74, 98, 74, 5, 62, 76, 45, 42, 85, 18, 76, 15, 41, 26, 32, 32, 13, 59, 53, 0, 71, 36, 68, 8, 86, 20, 31, 4, 23, 90, 32, 26, 63, 89, 99, 40, 25, 26, 32, 38, 90, 75, 9, 60, 95, 20, 52, 46, 34, 1, 29, 74, 6, 86, 40, 20, 25, 16, 78, 21, 15, 85, 43, 1, 89, 99, 87, 42, 32, 70, 41, 43, 9, 15, 74, 59, 74, 2, 78, 23, 42, 60, 47, 14, 30, 42, 51, 14, 44, 49, 99, 13, 9, 67, 38, 0, 56, 8, 30, 5, 34, 38, 4, 68, 17, 11, 31, 82, 69, 0, 39, 65, 5, 76, 61, 52, 95, 43, 6, 43, 19, 1, 14, 89, 86, 27, 42, 98, 64, 79, 73, 48, 3, 37, 76, 37, 91, 23, 97, 70, 96, 19, 47, 8, 31, 56, 37, 48, 98, 65, 20, 11, 98, 78, 95, 87, 46, 93, 42, 4, 1, 14, 23, 94, 44, 92, 62, 24, 56, 3, 10, 40, 68, 18, 41, 61, 20, 69, 41, 18, 90, 65, 58, 45, 32, 9, 34, 0, 7, 9, 55, 77, 31, 83, 24, 9, 57, 93, 9, 86, 26, 70, 72, 62, 29, 5, 18, 76, 4, 99, 95, 83, 83, 62, 32, 45, 91, 34, 91, 21, 31, 32, 85, 82, 38, 51, 68, 16, 81, 42, 86, 18, 26, 49, 30, 45, 57, 88, 26, 20, 91, 62, 63, 29, 62, 88, 14, 48, 38, 52, 51, 52, 26, 69, 56, 66, 70, 77, 71};
        int sorted[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 34, 34, 34, 34, 34, 34, 34, 34, 34, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 39, 39, 39, 39, 39, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 55, 55, 55, 55, 55, 55, 55, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 57, 57, 57, 57, 57, 57, 57, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 73, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 75, 75, 75, 75, 75, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 76, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 78, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 80, 80, 80, 80, 80, 80, 80, 80, 80, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 84, 84, 84, 84, 84, 84, 84, 84, 84, 84, 84, 84, 84, 84, 85, 85, 85, 85, 85, 85, 85, 85, 85, 85, 85, 85, 85, 85, 85, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 87, 87, 87, 87, 87, 87, 87, 87, 87, 87, 87, 88, 88, 88, 88, 88, 88, 88, 88, 88, 88, 88, 88, 88, 88, 88, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 93, 93, 93, 93, 93, 93, 93, 93, 93, 93, 93, 93, 93, 93, 93, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 96, 96, 96, 96, 96, 96, 96, 96, 96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99};
        long start = System.currentTimeMillis();
        
        for (int counter = 0; counter < 1000; counter++) {
            efficientbubbleSort(sorted);
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        System.out.println(Arrays.toString(sorted));
    }
}
