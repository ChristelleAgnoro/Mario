package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner PlayerM = new Scanner(System.in);
        int height;
        do {
            System.out.println("How tall do you want the tower? Choose a number between 1-8: ");
            while (!PlayerM.hasNextInt()) {
                System.out.println("Invalid response. Pick a valid number: ");
                PlayerM.next();
            }

            height = PlayerM.nextInt();

        }
        while (height < 1 || height >8 );
        System.out.println("The Pyramid height is: " + height);
        System.out.println("Stored: " + height);

        for (int row = 0; row < height; row++) {
            for (int col = 1; col < height - row; col++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash <= row; hash++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}

