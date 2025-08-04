package sampleapp;

import java.util.Scanner;
import banking.bankApp;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                bankApp bc = new bankApp();
                int attempts = 0;
                
                while(attempts < 3) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();
                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();
                    
                    if(bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        break; 
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT!");
                        
                        if(attempts == 3) {
                            System.out.println("Maximum attempts reached. Exiting.");
                            System.exit(0); 
                        }
                    }
                }
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}
    
