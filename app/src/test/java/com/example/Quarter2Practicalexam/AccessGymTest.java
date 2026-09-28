package com.example.Quarter2Practicalexam;

import java.util.Scanner;

public class AccessGymTest {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n=== GYM MENU ===");
            System.out.println("1. Enter Gym");
            System.out.println("2. Hire Trainer");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("You selected Enter Gym.");

            } else if (choice == 2) {

                System.out.println("You selected Hire Trainer.");

            } else if (choice == 3) {

                System.out.println("Exiting gym system.");
                running = false;

            } else {

                System.out.println("Invalid choice.");

            }
        }
    }
}