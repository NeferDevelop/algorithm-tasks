package com.neferdevelop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size --> ");
        int arraySize = in.nextInt();
        System.out.print("Enter the array elements --> ");
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = in.nextInt();
        }
        System.out.print("Answer --> ");
        duplicateZeros(array);
    }

    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        int[] newArray = new int[length];
        boolean flagZero = false;
        for (int i = 0, j = 0; j < length; i++, j++) {
            if (flagZero) {
                newArray[j] = 0;
                flagZero = false;
                i--;
            } else if (arr[i] == 0) {
                newArray[j] = 0;
                flagZero = true;
            } else {
                newArray[j] = arr[i];
            }
        }
        for (int j = 0; j < length; j++) {
            System.out.print(newArray[j] + " ");
        }
    }
}