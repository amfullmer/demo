package com.secretscribe.Codes;

import com.secretscribe.Interfaces.PigLatinable;
import org.springframework.stereotype.Component;

@Component
public class PigLatin implements PigLatinable {
    /*
    Oink Oink
     */

    @Override
    public String encodePigLatin(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        text = text.replaceAll("^\"|\"$", "");

        StringBuilder encodeString = new StringBuilder();
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            char[] letters = word.toCharArray();

            for (int i = 1; i < letters.length; i++) {
                encodeString.append(letters[i]);
            }
            encodeString.append(letters[0]).append("ay").append(" ");
        }

        return encodeString.toString().trim();
    }

    @Override
    public String decodePigLatin(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        text = text.replaceAll("^\"|\"$", "");

        StringBuilder decodeString = new StringBuilder();
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            if (word.length() < 3) {
                throw new IllegalArgumentException("Word must be at least 3 characters long");
            }

            // Extracting the original word without "ay" suffix
            String originalWord = word.substring(0, word.length() - 2);

            // Reverting the Pig Latin transformation
            decodeString.append(originalWord.charAt(originalWord.length() - 1))
                    .append(originalWord, 0, originalWord.length() - 1)
                    .append(" ");
        }
        return decodeString.toString().trim();
    }

}
