package com.neferdevelop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean answer = validMountainArray(inputArray());
        System.out.print("Answer --> " + answer);
    }
    public static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array --> ");
        int size = in.nextInt();
        System.out.print("Enter the array elements --> ");
        int [] array = new int[size];
        for(int i = 0; i < size;i++){
            array[i] = in.nextInt();
        }
        return array;
    }
    public static boolean validMountainArray(int[] arr) {
        int length = arr.length;
        int i = 0;
        if(length == 1 || length == 2){
            return false;
        }
        while (i + 1 < length && arr[i] < arr[i+1]){
            i++;
        }
        if(i == length-1 || i == 0){
            return false;
        }
        while (i+1 < length && arr[i] > arr[i+1]){
            i++;
        }
        return i == length - 1; // If equal elements are encountered, the iterator will be smaller than the size of the array
    }
}
