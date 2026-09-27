package com.example.Quarter2Practicalexam;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class FastFoodMenu {

    @Test
    public void testFastFoodFlow() {

        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");

        // Step 1: Order Burger as Combo
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("1\n"); // Choose Combo upgrade

        // Step 2: Order Burger as Solo
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("2\n"); // Choose Solo

        // Step 3: Order Fries
        automatedInput.append("2\n"); // Choose Order Fries

        // Step 4: Exit system
        automatedInput.append("3\n"); // Choose Exit

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(automatedInput.toString().getBytes());

        Scanner scanner = new Scanner(inputStream);

        FastFoodMenu fastFoodSystem = new FastFoodMenu();

        fastFoodSystem.start(scanner);

        scanner.close();
    }

    private void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n===== FAST FOOD MENU =====");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Fries");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- BURGER OPTIONS ---");
                    System.out.println("1. Combo");
                    System.out.println("2. Solo");
                    System.out.print("Enter your choice: ");

                    int burgerChoice = scanner.nextInt();

                    if (burgerChoice == 1) {
                        System.out.println("You ordered a Burger Combo.");
                    } else if (burgerChoice == 2) {
                        System.out.println("You ordered a Solo Burger.");
                    } else {
                        System.out.println("Invalid burger option.");
                    }

                    break;

                case 2:
                    System.out.println("You ordered Fries.");
                    break;

                case 3:
                    System.out.println("Thank you for ordering!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}