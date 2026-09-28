package com.example.Quarter2Practicalexam.quarter2minipetas;
import org.junit.Test;
public class MiniPeta1 {
    @Test
    public void printMyProfile() {
        // --- 1. THE INPUT (Storing your personal details in variables)---
        String myName = "Vi!";
        String petName = "Sophiee";
        String favFood = "Pizza!";
        int myAge = 16;

        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and i am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}
