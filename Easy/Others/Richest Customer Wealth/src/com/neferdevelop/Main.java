package com.neferdevelop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberOfClients = 0, numberOfAccounts = 0;
        System.out.print("Enter the number of clients --> ");
        numberOfClients = in.nextInt();
        System.out.print("Enter the number of accounts --> ");
        numberOfAccounts = in.nextInt();

        int [][] amountOnTheAccount = new int[numberOfClients][numberOfAccounts];
        System.out.println("Enter the amount on each account (line by line):");
        fillAmount(amountOnTheAccount);
        outputAmountOfTheRichest(maximumWealth(amountOnTheAccount));

    }

    public static void fillAmount(int [][] accounts){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length;j++){
                accounts[i][j] = in.nextInt();
            }
        }
    }

    public static int maximumWealth(int[][] accounts) {
        int amount = 0, result = 0;
        for(int i = 0; i < accounts.length; i++){
            amount = 0;
            for (int j = 0; j < accounts[i].length; j++){
                amount += accounts[i][j];
            }
            if (amount > result){
                result = amount;
            }
        }
        return result;
    }

    public static void outputAmountOfTheRichest(int amountOfTheRichest){
        System.out.print("The richest has the amount --> " + amountOfTheRichest);
    }

}
