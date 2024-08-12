package dev.pranavtech.week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Number n = new Number();
        Scanner input = new Scanner(System.in);

        new HexNumber(n);
        new BinNumber(n);

        while(true){
            System.out.println("\nEnter a number: ");
            n.setValue(input.nextInt());
        }
    }

}
