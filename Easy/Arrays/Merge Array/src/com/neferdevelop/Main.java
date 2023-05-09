package com.neferdevelop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number m --> ");
        int m = in.nextInt();
        System.out.print("Enter the number n --> ");
        int n = in.nextInt();
        System.out.print("Enter the first array of size " + m + " --> ");
        int[] nums1 = new int[n+m];
        for (int i = 0; i < m; i++){
            if(i == m){
                nums1[i] = 0;
            }
            else
                nums1[i] = in.nextInt();
        }
        System.out.print("Enter the second array of size " + n + " --> ");
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++){
            nums2[i] = in.nextInt();
        }
        System.out.println();
        System.out.print("Answer --> ");
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }

        while (j>=0){
            nums1[k--] = nums2[j--];
        }


        for (int c = 0; c < m+n; c++){
            System.out.print(nums1[c] + " ");
        }
    }
}
