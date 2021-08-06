package org.calimpl;
import org.calapi.Calculator;

import java.util.Scanner;

public class Application {
    public static void main (String args[]){
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner (System.in);


        System.out.println("\nOPTIONS:");
        System.out.println("\n1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. DIVISION");
        System.out.println("4. MULTIPLICATION");

        System.out.println("\nCHOOSE FROM OPTIONS:");
        int choice = sc.nextInt();
        System.out.println();

        if (choice == 1){
            calculator.addition();
        }
        else if (choice == 2){
            calculator.subtraction();
        }
        else if (choice == 3){
            calculator.division();
        }
        else if (choice == 4){
            calculator.multiplication();
        }


    }
}
