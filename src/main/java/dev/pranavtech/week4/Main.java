package dev.pranavtech.week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Number n = new Number();
        Scanner input = new Scanner(System.in);

        new HexNumber(n);
        new BinNumber(n);

        while(true){
            try {
                System.out.println("\nEnter a number: ");
                n.setValue(input.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                input.next(); // Clear the invalid input from the scanner buffer
            }
        }
    }

}
