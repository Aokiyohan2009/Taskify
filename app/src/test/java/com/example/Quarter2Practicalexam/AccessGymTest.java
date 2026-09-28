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
                System.out.println("Choose membership level:");
                System.out.println("1. Level 1 - $50");
                System.out.println("2. Level 2 - $80");

                int level = scanner.nextInt();

                if (level == 1) {

                    double membershipFee = 50.00;
                    double trainerFee = 20.00;
                    double total = membershipFee + trainerFee;

                    System.out.println("Level 1 membership selected.");
                    System.out.println("Membership Fee: $" + membershipFee);
                    System.out.println("Trainer Fee: $" + trainerFee);
                    System.out.println("Total: $" + total);

                } else if (level == 2) {

                    double membershipFee = 80.00;
                    double trainerFee = 20.00;
                    double total = membershipFee + trainerFee;

                    System.out.println("Level 2 membership selected.");
                    System.out.println("Membership Fee: $" + membershipFee);
                    System.out.println("Trainer Fee: $" + trainerFee);
                    System.out.println("Total: $" + total);

                } else {

                    System.out.println("Invalid membership level.");
                }

            } else if (choice == 2) {

                double trainerFee = 20.00;

                System.out.println("Trainer selected.");
                System.out.println("Trainer Fee: $" + trainerFee);

            } else if (choice == 3) {

                System.out.println("Exiting gym system.");
                running = false;

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }
}