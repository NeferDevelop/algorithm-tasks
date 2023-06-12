package com.neferdevelop;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the size of the array --> ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.print("Enter the array elements --> ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("Enter the target number --> ");
        int target = in.nextInt();
        int[] result = twoSum(nums,target);
        System.out.print("[ ");
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i]);
            if (i!=1){
                System.out.print(",");
            }
        }
        System.out.print(" ]");
    }
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < size; i++){
            if (hashMap.containsKey(target-nums[i])){
                result[1] = i;
                result[0] = hashMap.get(target-nums[i]);
            }
            hashMap.put(nums[i],i);
        }
        return result;
    }
}
