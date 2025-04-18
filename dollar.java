/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;


import java.util.Scanner;
public class JavaApplication43 {

 public static void main(String[] args) {
        Scanner wama = new Scanner(System.in);
        double dollar;

        // Input for dollar amount
        System.out.println("ENTER THE AMOUNT OF DOLLAR YOU WANT:");
        dollar = wama.nextDouble();
        wama.nextLine(); // Consume the newline left by nextDouble()

        // Input for currency of your choice
        System.out.println("Which currency you want to convert to (EURO, ZAR, BRITISH POUND, JAPAN YEN, INDIAN)?");
        String choice = wama.nextLine();

        double convertedAmount = 0; // Initialize converted amount variable
        // Exchange rates of different countries
        double exRateEuro = 1.08;      // $1 = 1.08 EURO
        double exRateZar = 18.24;      // $1 = 18.24 ZAR
        double exRatePound = 0.775;    // $1 = 0.775 BRITISH POUND
        double exRateYen = 137.41;     // $1 = 137.41 JAPAN YEN
        double exRateInr = 87.09;      // $1 = 87.09 INDIAN RUPEE

        // Conversion of denominations
        switch (choice.toUpperCase()) {
            case "EURO":
                System.out.println("Exchange rate: $1 = 1.08 EURO");
                convertedAmount = dollar * exRateEuro;
                break;
            case "ZAR":
                System.out.println("Exchange rate: $1 = 18.24 ZAR");
                convertedAmount = dollar * exRateZar;
                break;
            case "BRITISH POUND":
                System.out.println("Exchange rate: $1 = 0.775 BRITISH POUND");
                convertedAmount = dollar * exRatePound;
                break;
            case "JAPAN YEN":
                System.out.println("Exchange rate: $1 = 137.41 JAPAN YEN");
                convertedAmount = dollar * exRateYen;
                break;
            case "INDIAN":
                System.out.println("Exchange rate: $1 = 87.09 INDIAN RUPEE");
                convertedAmount = dollar * exRateInr;
                break;
            default:
                System.out.println("Invalid currency choice.");
                return;
        }

        // Display the converted amount
        System.out.printf("Converted amount:"+ convertedAmount);
    }

   
    
}

