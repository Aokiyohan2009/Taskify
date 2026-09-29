package com.example.Quarter2Practicalexam.quarter2minipetas;

import org.junit.Test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MiniPeta3DUECategory {
@Test
    public static String getCategory(LocalDate dueDate) {

        LocalDate today = LocalDate.now();

        // Calculate the number of days until the due date
        long daysUntilDue = ChronoUnit.DAYS.between(today, dueDate);

        // RED: 1-3 days before due date
        if (daysUntilDue >= 1 && daysUntilDue <= 3) {
            return "RED";
        }

        // YELLOW: 4-6 days before due date
        else if (daysUntilDue >= 4 && daysUntilDue <= 6) {
            return "YELLOW";
        }

        // GREEN: 7-10 days before due date
        else if (daysUntilDue >= 7 && daysUntilDue <= 10) {
            return "GREEN";
        }

        // Already overdue
        else if (daysUntilDue < 0) {
            return "OVERDUE";
        }

        // More than 10 days away
        else {
            return "NO CATEGORY";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dateInput);

        String category = getCategory(dueDate);

        System.out.println("\n--- TASK INFORMATION ---");
        System.out.println("Task: " + taskName);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Category: " + category);

        scanner.close();
    }
}