package com.sample;

public class Program4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Array to store counts for numbers 1 to 9 (index 0 is unused)
        int[] count = new int[10];

        // Loop through each number in the list
        for (int num : numbers) {
            // Check divisibility from 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    count[i]++;
                }
            }
        }

        // Print the result
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}

