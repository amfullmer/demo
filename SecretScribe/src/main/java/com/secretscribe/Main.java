package com.secretscribe;

public class Main {
    UserInterface userInterface = new UserInterface();

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            userInterface.encodeOrDecode();
            menuSelection = userInterface.promptForMenuSelection("Please choose an option: ");

            //encoding messages
            if (menuSelection == 1) {
                userInterface.printCodeMessage();
                userInterface.printLanguageOptions();
                menuSelection = userInterface.promptForMenuSelection("Please choose and option: ");

                if (menuSelection == 1) {
                    userInterface.encodeMorseCode(userInterface.promptUserForMessage());
                } else if (menuSelection == 2) {
                    userInterface.encodeCaesarCipher(userInterface.promptUserForMessage());
                } else if (menuSelection == 3) {
                    userInterface.encodePigLatin(userInterface.promptUserForMessage());
                } else {
                    System.out.println("Invalid selection");
                }

                //decoding messages
            } else if (menuSelection == 2) {
                userInterface.printDecodeMessage();
                userInterface.printLanguageOptions();
                menuSelection = userInterface.promptForMenuSelection("Please choose and option: ");

                if (menuSelection == 1) {
                    userInterface.decodeMorseCode(userInterface.promptUserForMessage());
                } else if (menuSelection == 2) {
                    userInterface.decodeCaesarCipher(userInterface.promptUserForMessage());
                } else if (menuSelection == 3) {
                    userInterface.decodePigLatin(userInterface.promptUserForMessage());
                } else {
                    System.out.println("Invalid selection");
                }

            } else if (menuSelection == 0) {
                continue;

            } else {
                // anything else is not valid
                System.out.println("Invalid Selection");
            }

        }

    }

}

