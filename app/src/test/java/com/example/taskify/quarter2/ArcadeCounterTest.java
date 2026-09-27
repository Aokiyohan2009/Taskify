package com.example.sampleapplicationfordemo.quarter2.practicalexam;

import java.util.Scanner;

public class ArcadeCounterTest {
    public void start(Scanner scanner) {
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tokens bought");
                    break;
                case 3:
                    System.out.println("Exiting system");
                    break;
            }
        } while (choice != 3);
    }
}
