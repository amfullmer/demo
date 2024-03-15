package Codes;

public class PigLatin {

    public static String encodePigLatin(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

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

    public static String decodePigLatin(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

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
