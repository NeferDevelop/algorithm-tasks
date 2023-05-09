package com.neferdevelop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the number --> ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("Number of steps --> " + numberOfSteps(number));
    }
    public static int numberOfSteps(int num) {
        int numberOfSteps = 0;
        while(num!=0){
            if (num % 2 == 0){
                num = num/2;
            }
            else {
                num -= 1;
            }
            numberOfSteps++;
        }
        return numberOfSteps;
    }

}
