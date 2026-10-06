package com.example.sampleapplicationfordemo.quarter2.practicalexam;

import java.util.Scanner;

public class ArcadeCounterTest {
    public void start(Scanner scanner) {
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tokens bought successfully!");
                    break;
                case 2:
                    int tickets = scanner.nextInt();
                    if (tickets >= 500) {
                        System.out.println("Teddy Bear Won");
                    } else {
                        System.out.println("Keep Playing");
                    }
                    break;
                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}