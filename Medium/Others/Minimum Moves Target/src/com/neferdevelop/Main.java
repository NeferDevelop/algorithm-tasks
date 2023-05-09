package com.neferdevelop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the target --> ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.print("Enter the maxDoubles --> ");
        int maxDoubles = in.nextInt();
        System.out.print("Minimum number of steps --> " + minMoves(target,maxDoubles));
    }
    public static int minMoves(int target, int maxDoubles) {
        int numberOfSteps = 0;
        while(target!=1 && maxDoubles!=0){
            if(target % 2 == 0 && maxDoubles!=0){
                target /= 2;
                maxDoubles--;
            }
            else{
                target--;
            }
            numberOfSteps++;
        }
        return numberOfSteps+(target - 1);
    }


}
