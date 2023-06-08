package com.neferdevelop;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the size of the array --> ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.print("Enter the array elements --> ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        HashSet<Integer> hashNums = new HashSet<>();
        for (int i = 0; i < length; i++){
            if(hashNums.contains(nums[i])){
                return true;
            }
            hashNums.add(nums[i]);
        }
        return false;
    }
}
