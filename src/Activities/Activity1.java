package activity1;

import java.util.Scanner;


public class Activity1 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String name;
       String remarks;
       int subjects,grade, total = 0;
       
       System.out.print("Enter student name: ");
        name = input.nextLine();
        
       System.out.print("Enter number of subjects: ");
        subjects = input.nextInt();
            
        
        
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grade = input.nextInt();
            total += grade; 
        }
       
        
        double average = (double) total / subjects;
        
        
        System.out.println("\nAverage: " + average);
        
     
        if (average < 75.99) {
            System.out.println("FAIL");
        } else {
            System.out.println("PASSED");
        }
        
    }
}
