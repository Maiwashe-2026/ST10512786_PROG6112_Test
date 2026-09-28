/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Shirley
 */
import java.util.Scanner;
public class GamingConsoleReport {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[][] sales = new int[3][3]; // Fixed: Changed from [3][2] to [3][3] for 3 consoles
        
        // Input section for PS5, XBOX, and SWITCH
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of PS5 sales for " + cities[i] + ": ");
            sales[i][0] = input.nextInt();
            
            System.out.print("Enter the number of XBOX sales for " + cities[i] + ": ");
            sales[i][1] = input.nextInt();

            System.out.print("Enter the number of SWITCH sales for " + cities[i] + ": ");
            sales[i][2] = input.nextInt(); // Fixed: Added input for the 3rd console
        }
        
        // The report table
        System.out.println("\n==================================================");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("==================================================");
        System.out.println("| CITY       | PS5  | XBOX  | SWITCH |");
        System.out.println("|------------|------|-------|--------|");
        
        for (int i = 0; i < cities.length; i++) {
            // Fixed: Included the 3rd column (%-6d) and matching variables
            System.out.printf("| %-10s | %-4d | %-5d | %-6d |\n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        
        // Console total sales for each city
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");
        
        int[] totals = new int[3];
        for (int i = 0; i < cities.length; i++) {
            // Fixed: Corrected the addition to sum all 3 columns for row i
            totals[i] = sales[i][0] + sales[i][1] + sales[i][2]; 
            System.out.println(cities[i] + ": " + totals[i]);
        }
        
        // CITY WITH THE MOST SALES
        int max = totals[0];
        String maxCity = cities[0];
        
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > max) {
                max = totals[i];
                maxCity = cities[i];
            }
        }
        
        System.out.println("\nCITY WITH THE MOST SALES: " + maxCity);
        
        input.close();
    }
}