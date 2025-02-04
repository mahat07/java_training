package com.celcom.day1;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int choice;
        do {
          
            System.out.println("Choose your choice\n1 for addition"
                    + "\n2 for subtraction" + "\n3 for multiplication" + "\n4 for division"
                    + "\n5 for exit");
            
         
            choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Thanks");
                break; 
            }
            
           
            if (choice >= 1 && choice <= 4) {
                System.out.println("Input two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                
                switch(choice) {
                    case 1:
                        res = num1 + num2;
                        break;
                    case 2:
                        res = num1 - num2;
                        break;
                    case 3:
                        res = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            res = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        break;
                }
                System.out.println("Result: " + res);
            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
            }
        } while (choice != 5);
        
    }
}
