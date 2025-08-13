package Activities;

import java.util.Scanner;

public class Airfare {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        
        int classChoice = sc.nextInt();
        
        double farePerKm = 0;
        
        if (classChoice == 1) {
            farePerKm = 250; 
        } else if (classChoice == 2) {
            farePerKm = 500; 
        }
        
        double totalFare = distance * farePerKm;
        
        if (distance > 1000) {
            totalFare = totalFare * 0.9; 
        }
      
        System.out.println("Input:");
        System.out.println("Distance (km): " + (int)distance);
        System.out.println("Class: " + classChoice);
        System.out.println("Output:");
        System.out.println("Total Fare: " + String.format("%.2f", totalFare));
        
        sc.close();
    }

}
