package com.secretscribe;

import com.secretscribe.Codes.CaesarCipher;
import com.secretscribe.Codes.MorseCode;
import com.secretscribe.Codes.PigLatin;

import java.util.Scanner;

public class UserInterface {
    Scanner userInput = new Scanner(System.in);
    MorseCode morseCode = new MorseCode();
    CaesarCipher caesarCipher = new CaesarCipher();
    PigLatin pigLatin = new PigLatin();

    public void encodeOrDecode() {
        System.out.println("Welcome to your one stop shop for encoding and decoding secret messages");
        System.out.println("1. I have a top secret message I need to encode.");
        System.out.println("2. I have a secret message I want to decode.");
        System.out.println("0. Exit.");
    }

    public void printLanguageOptions() {
        System.out.println("1. Morse Code");
        System.out.println("2. Caesar Cipher");
        System.out.println("3. Pig Latin");
    }

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(userInput.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }


    public void printCodeMessage() {
        System.out.println("You have a message you want to keep secret.");
        System.out.println("What language would you like to encode your message in?");
    }

    public void printDecodeMessage() {
        System.out.println("Time to decode a secret message.");
        System.out.println("What language is your encoded message in?");
    }

    public void encodeMorseCode(String message) {
        System.out.println(morseCode.encodeMorseCode(message));
    }

    public void decodeMorseCode(String message) {
        System.out.println(morseCode.decodeMorseCode(message));
    }

    public void encodeCaesarCipher(String message) {
        System.out.println(caesarCipher.encodeCaesarCipher(message));
    }

    public void decodeCaesarCipher(String message) {
        System.out.println(caesarCipher.decodeCaesarCipher(message));
    }

    public void encodePigLatin(String message) {
        System.out.println(pigLatin.encodePigLatin(message));
    }

    public void decodePigLatin(String message) {
        System.out.println(pigLatin.decodePigLatin(message));
    }

    public String promptUserForMessage() {
        System.out.println("What is the message? ");
        String message;

        do {
            message = userInput.nextLine().trim();
            if (message.isBlank()) {
                System.out.println("No message entered. Try again.");
            }

        } while (message.isBlank());

        return message;
    }

}
