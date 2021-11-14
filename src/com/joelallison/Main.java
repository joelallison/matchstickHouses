package com.joelallison;

import java.util.Scanner;

public class Main {

    static int matchstickHouse(int houses){
        if(houses != 0){
            return ((houses-1)*5) + 6;
        }
        return 0;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int userInput = 0;
        boolean validAnswer = false;
        while(!validAnswer){
            try {
                System.out.println("How many matchstick houses?");
                userInput = input.nextInt();
                validAnswer = true;
            } catch (Exception e){
                System.out.println("That's not a valid input - " + e);
                input.next();
            }
        }


        System.out.println("You will need " + matchstickHouse(userInput) + " matchsticks to build that many houses.");
    }
}
