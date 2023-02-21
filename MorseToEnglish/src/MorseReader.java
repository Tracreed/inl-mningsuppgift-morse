// Import bimap
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class MorseReader {
    // Create a bimap to store the conversion
    private final BiMap<String, String> morseMap = HashBiMap.create();

    // Constructor
    public MorseReader() {
        // Add the morse code to the bimap
        morseMap.put("A", ".-");
        morseMap.put("B", "-...");
        morseMap.put("C", "-.-.");
        morseMap.put("D", "-..");
        morseMap.put("E", ".");
        morseMap.put("F", "..-.");
        morseMap.put("G", "--.");
        morseMap.put("H", "....");
        morseMap.put("I", "..");
        morseMap.put("J", ".---");
        morseMap.put("K", "-.-");
        morseMap.put("L", ".-..");
        morseMap.put("M", "--");
        morseMap.put("N", "-.");
        morseMap.put("O", "---");
        morseMap.put("P", ".--.");
        morseMap.put("Q", "--.-");
        morseMap.put("R", ".-.");
        morseMap.put("S", "...");
        morseMap.put("T", "-");
        morseMap.put("U", "..-");
        morseMap.put("V", "...-");
        morseMap.put("W", ".--");
        morseMap.put("X", "-..-");
        morseMap.put("Y", "-.--");
        morseMap.put("Z", "--..");
        morseMap.put("1", ".----");
        morseMap.put("2", "..---");
        morseMap.put("3", "...--");
        morseMap.put("4", "....-");
        morseMap.put("5", ".....");
        morseMap.put("6", "-....");
        morseMap.put("7", "--...");
        morseMap.put("8", "---..");
        morseMap.put("9", "----.");
        morseMap.put("0", "-----");
        morseMap.put(".", ".-.-.-");
        morseMap.put(",", "--..--");
        morseMap.put("?", "..--..");
        morseMap.put("!", "-.-.--");
        morseMap.put("/", "-..-.");
        morseMap.put("(", "-.--.");
        morseMap.put(")", "-.--.-");
        morseMap.put("&", ".-...");
        morseMap.put(":", "---...");
        morseMap.put(";", "-.-.-.");
        morseMap.put("=", "-...-");
        morseMap.put("+", ".-.-.");
        morseMap.put("-", "-....-");
        morseMap.put("_", "..--.-");
        morseMap.put("\"", ".-..-.");
        morseMap.put("$", "...-..-");
        morseMap.put("@", ".--.-.");
    }

    // Method to convert morse code to english
    public String morseToEnglish(String morse) {
        String[] words = morse.split("/");
        StringBuilder english = new StringBuilder();
        for (String word : words) {
            String[] letters = word.trim().split(" ");
            for (String letter : letters) {
                String character = morseMap.inverse().get(letter);
                if (character != null) {
                    english.append(character);
                }
            }
            english.append(" ");
        }
        return english.toString().trim();
    }


    // Method to convert english sentences to morse code
    public String englishToMorse(String english) {
        String[] englishArray = english.split(" ");
        StringBuilder morse = new StringBuilder();
        for (String word : englishArray) {
            for (int i = 0; i < word.length(); i++) {
                morse.append(morseMap.get(Character.toString(word.charAt(i)).toUpperCase()));
                if (i != word.length() - 1) {
                    morse.append(" ");
                }
            }
            // Add a slash between words unless it is the last word
            if (!word.equals(englishArray[englishArray.length - 1])) {
                morse.append("/");
            }
        }
        return morse.toString().trim();
    }
}
