package com.example.Quarter2Practicalexam.quarter2minipetas;

import org.junit.Test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MiniPeta3DUECategory {

    // Determines the category based on the number of days
    // remaining before the due date.
    public static String getCategory(LocalDate dueDate) {

        LocalDate today = LocalDate.now();

        // Calculate days until the due date
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

        // Due today
        else if (daysUntilDue == 0) {
            return "DUE TODAY";
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

    @Test
    public void testDueCategory() {
        LocalDate today = LocalDate.now();
        System.out.println("MinePeta 1 (2 days out): " + getCategory(today.plusDays(2)));
        System.out.println("MiniPeta 2 (5 days out): " + getCategory(today.plusDays(5)));
        System.out.println("MajorPeta 3 (8 days out): " + getCategory(today.plusDays(8)));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();

        try {
            LocalDate dueDate = LocalDate.parse(dateInput);

            String category = getCategory(dueDate);

            System.out.println("\n--- TASK INFORMATION ---");
            System.out.println("Task: " + taskName);
            System.out.println("Due Date: " + dueDate);
            System.out.println("Category: " + category);

        } catch (Exception e) {
            System.out.println("Invalid date!");
            System.out.println("Please use the format YYYY-MM-DD.");
        }

        scanner.close();
    }
}
