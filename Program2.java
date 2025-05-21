package com.sample;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        // Generate and print the series
        int number = 1; // start from 1
        for (int i = 0; i < a; i++) {
            System.out.print(number);
            if (i < a - 1) {
                System.out.print(", ");
            }
            number += 2; // move to next odd number
        }

        scanner.close();
    }
}

