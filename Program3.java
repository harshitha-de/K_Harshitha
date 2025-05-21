package com.sample;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        // Determine number of terms to print
        int terms = (a % 2 == 0) ? a - 1 : a;

        // Generate and print the series
        int number = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(number);
            if (i < terms - 1) {
                System.out.print(", ");
            }
            number += 2;
        }

        scanner.close();
    }
}

