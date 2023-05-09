package com.neferdevelop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the size of the array ---> ");
        Scanner in = new Scanner(System.in);
        int sizeArray = in.nextInt();
        int []array = new int[sizeArray];
        System.out.print("Enter the array elements ---> ");
        fillArray(array);
        System.out.print("Array after processing ---> ");
        outputArray(runningSum(array));
    }

    public static void fillArray(int []array){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

    public static void outputArray(int []array){
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.print(" ]");
    }
}
