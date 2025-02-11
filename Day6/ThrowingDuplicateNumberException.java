package com.celcom.day6;

import java.util.Scanner;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException() {
        super("Cannot contain duplicate numbers, enter again.");
    }
}

public class ThrowingDuplicateNumberException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 unique numbers: ");
        
        for (int i = 0; i < 10; i++) {
            try {
                int num = sc.nextInt();
                
                // Check for duplicates in the array
                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        throw new DuplicateNumberException();
                    }
                }
                
                arr[i] = num; // Store only if it's unique
                
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
                i--; // Decrement to retry input for the same index
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear invalid input
                i--; // Decrement to retry
            }
        }
        
        sc.close();
        System.out.println("Valid unique numbers entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
