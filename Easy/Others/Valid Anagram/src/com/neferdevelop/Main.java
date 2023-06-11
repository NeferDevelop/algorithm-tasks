package com.neferdevelop;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first word --> ");
        String s = in.nextLine();
        System.out.print("Enter the second word --> ");
        String t = in.nextLine();
        System.out.print("Is the first line an anagram of the second line(True/False)? " + "\n" +
                "Answer - " + isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int wordLength = s.length(); // t.length() - no matter
        HashMap<Character,Integer> countMap = new HashMap<>();
        for(int i = 0; i<wordLength;i++){
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < wordLength; i++){
            if(!countMap.containsKey(t.charAt(i)) || countMap.get(t.charAt(i)) <= 0){
                return false;
            }
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i),0)-1);
        }
        return true;
    }
}
