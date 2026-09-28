package com.example.Quarter2Practicalexam.quarter2minipetas;

import org.junit.Test;

public class MiniPeta2 {
    @Test
    public void printMyProfile() {
        // --- 1. THE INPUT (Storing your personal details in variables) ---
        String myName = "Vince Kyle A. Nolasco!";
        String nickName = "Vi!";
        String favGame = "Valorant!";
        String FavColor = "Purple";
        int myAge = 16;

        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- My Profile ---");
        System.out.println("Hello my name is " + myName + " and I'm " + myAge + " years old.");
        System.out.println("my Nickname is " + nickName + " and call me by my nickname.");
        System.out.println("My favorite game is " + favGame + " and I'd play it everyday if I could.");
        System.out.println("And my favorite color is " + FavColor + ".");
    }
}