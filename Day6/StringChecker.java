package com.celcom.day6;

import java.util.Scanner;

class NoVowelException extends Exception {
    public NoVowelException() {
        super("No vowels found in the string!");
    }
}

public class StringChecker {

    int stringScanner(String s) throws NoVowelException {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (char v : vowels) {
                if (c == v) {
                    count++;
                    break;
                }
            }
        }
        
        if (count == 0) {
            throw new NoVowelException();
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String k = sc.next();
        sc.close();

        StringChecker checker = new StringChecker();
        
        try {
            int vowelCount = checker.stringScanner(k);
            System.out.println("Number of vowels in the string: " + vowelCount);
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }
}
