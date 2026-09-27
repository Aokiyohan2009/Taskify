package com.example.sampleapplicationfordemo.quarter2.practicalexam;

import java.util.Scanner;

public class ArcadeCounterTest {
    public void start(Scanner scanner) {
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    int tickets = scanner.nextInt();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
