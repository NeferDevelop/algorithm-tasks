package com.neferdevelop;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number N = ");
        int n = in.nextInt();
        printList(fizzBuzz(n));
    }
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            boolean dividedBy3 = i%3 == 0 ? true : false;
            boolean dividedBy5 = i%5 == 0 ? true : false;
            if(dividedBy3 && dividedBy5){
                answer.add("FizzBuzz");
            }
            else if(dividedBy3)
                answer.add("Fizz");
            else if(dividedBy5)
                answer.add("Buzz");
            else
                answer.add(String.valueOf(i));
        }
        return answer;
    }

    public static void printList(ArrayList<String> array){
        System.out.print("[");
        for (int i = 0; i < array.size(); i++){
            System.out.print(array.get(i));
            if(i < array.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
