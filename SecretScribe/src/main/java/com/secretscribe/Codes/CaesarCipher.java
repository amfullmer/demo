package com.secretscribe.Codes;

import com.secretscribe.Interfaces.CaeserCipherable;

import java.util.HashMap;

import static java.lang.Character.toLowerCase;

public class CaesarCipher implements CaeserCipherable {
    /*
    All hail
     */
    private static final HashMap<Character, Character> caesarCipherMap = new HashMap<>();

    static {
        // Populate the Caesar Cipher map - shift of 3
        caesarCipherMap.put('A', 'D');
        caesarCipherMap.put('B', 'E');
        caesarCipherMap.put('C', 'F');
        caesarCipherMap.put('D', 'G');
        caesarCipherMap.put('E', 'H');
        caesarCipherMap.put('F', 'I');
        caesarCipherMap.put('G', 'J');
        caesarCipherMap.put('H', 'K');
        caesarCipherMap.put('I', 'L');
        caesarCipherMap.put('J', 'M');
        caesarCipherMap.put('K', 'N');
        caesarCipherMap.put('L', 'O');
        caesarCipherMap.put('M', 'P');
        caesarCipherMap.put('N', 'Q');
        caesarCipherMap.put('O', 'R');
        caesarCipherMap.put('P', 'S');
        caesarCipherMap.put('Q', 'T');
        caesarCipherMap.put('R', 'U');
        caesarCipherMap.put('S', 'V');
        caesarCipherMap.put('T', 'W');
        caesarCipherMap.put('U', 'X');
        caesarCipherMap.put('V', 'Y');
        caesarCipherMap.put('W', 'Z');
        caesarCipherMap.put('X', 'A');
        caesarCipherMap.put('Y', 'B');
        caesarCipherMap.put('Z', 'C');
        caesarCipherMap.put('.', '.');
        caesarCipherMap.put('?', '?');
        caesarCipherMap.put('!', '!');
        caesarCipherMap.put(',', ',');
    }

    public String encodeCaesarCipher(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        StringBuilder encodedString = new StringBuilder();
        String[] words = text.toUpperCase().split(" ");
        boolean isFirstWord = true;

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (caesarCipherMap.containsKey(c)) {

                    if (isFirstWord) {
                        encodedString.append(caesarCipherMap.get(c));
                        isFirstWord = false;
                    } else {
                        char d = caesarCipherMap.get(c);
                        d = toLowerCase(d);
                        encodedString.append(d);
                    }

                }
            }
            encodedString.append(" ");
        }

        String encodedText = encodedString.toString();

        return encodedText.trim();
    }

    public String decodeCaesarCipher(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        StringBuilder decodeString = new StringBuilder();
        String[] words = text.toUpperCase().split(" ");
        boolean isFirstWord = true;

        for (String word : words) {
            for (char c : word.toCharArray()) {
                for (Character key : caesarCipherMap.keySet()) {
                    if (caesarCipherMap.get(key) == c) {

                        if (isFirstWord) {
                            decodeString.append(key);
                            isFirstWord = false;
                        } else {
                            char d = key;
                            d = toLowerCase(d);
                            decodeString.append(d);
                        }

                    }
                }
            }
            decodeString.append(" ");
        }

        String decodedText = decodeString.toString();

        return decodedText.trim();
    }

}
