package activity1;

import java.util.Scanner;


public class activity2 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter employee name: ");
        String ename = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        float hrate = sc.nextFloat();
        System.out.print("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        
        float gross = hrate*hours;
        
        
        System.out.println("----------------Wage Summary-----------------");
        System.out.println("Employee: " +ename);
        System.out.println("Hourly Rate: ₱" +hrate);
        System.out.println("Hours Worked: " +hours);
        System.out.println("Gross Weekly Wage: ₱" +gross);
        System.out.println("SSS Contribution (10%): ₱" +(gross*0.1));
        System.out.println("---------------------------------------------");
        System.out.println("Net Weekly Wage: ₱" +((gross)-(gross*0.1)));
        
        
        
    }
            
            }

