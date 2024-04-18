package com.secretscribe.Codes;

import com.secretscribe.Interfaces.MorseCodeable;
import org.springframework.stereotype.Component;

import java.util.HashMap;

import static java.lang.Character.toLowerCase;

@Component
public class MorseCode implements MorseCodeable {
    /*
    The saddest of the codes... get it?
     */

    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();

    static {
        //populate the Morse Code map
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put(' ', "/");
        morseCodeMap.put('.', "|");
        morseCodeMap.put('!', "!");
        morseCodeMap.put('?', "?");
        morseCodeMap.put(',', ",");
    }

    @Override
    public String encodeMorseCode(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        StringBuilder encodedString = new StringBuilder();

        for (char c : text.toUpperCase().toCharArray()) {
            if (morseCodeMap.containsKey(c)) {
                encodedString.append(morseCodeMap.get(c)).append(" ");
            }
        }
        String code = encodedString.toString();
        return code.trim();
    }

    @Override
    public String decodeMorseCode(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        StringBuilder decodedString = new StringBuilder();
        String[] words = text.split("/");
        boolean isFirstWord = true;

        for (String word : words) {
            String[] letters = word.trim().split(" ");

            for (String letter : letters) {

                for (Character key : morseCodeMap.keySet()) {
                    if (morseCodeMap.get(key).equals(letter)) {

                        if (isFirstWord) {
                            decodedString.append(key);
                            isFirstWord = false;
                        } else {
                            char d = key;
                            d = toLowerCase(d);
                            decodedString.append(d);
                        }
                    }
                }

            }
            decodedString.append(" ");
        }
        String decoded = decodedString.toString();
        return decoded.trim();
    }

}
