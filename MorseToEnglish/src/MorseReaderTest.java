import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseReaderTest {

    MorseReader morseReader;
    @BeforeEach
    void setUp() {
        morseReader = new MorseReader();
    }

    @Test
    @DisplayName("Check that morse code is converted to english")
    void testMorseToEnglish() {
        // Check all the letters
        assertEquals("A", morseReader.morseToEnglish(".-"));
        assertEquals("B", morseReader.morseToEnglish("-..."));
        assertEquals("C", morseReader.morseToEnglish("-.-."));
        assertEquals("D", morseReader.morseToEnglish("-.."));
        assertEquals("E", morseReader.morseToEnglish("."));
        assertEquals("F", morseReader.morseToEnglish("..-."));
        assertEquals("G", morseReader.morseToEnglish("--."));
        assertEquals("H", morseReader.morseToEnglish("...."));
        assertEquals("I", morseReader.morseToEnglish(".."));
        assertEquals("J", morseReader.morseToEnglish(".---"));
        assertEquals("K", morseReader.morseToEnglish("-.-"));
        assertEquals("L", morseReader.morseToEnglish(".-.."));
        assertEquals("M", morseReader.morseToEnglish("--"));
        assertEquals("N", morseReader.morseToEnglish("-."));
        assertEquals("O", morseReader.morseToEnglish("---"));
        assertEquals("P", morseReader.morseToEnglish(".--."));
        assertEquals("Q", morseReader.morseToEnglish("--.-"));
        assertEquals("R", morseReader.morseToEnglish(".-."));
        assertEquals("S", morseReader.morseToEnglish("..."));
        assertEquals("T", morseReader.morseToEnglish("-"));
        assertEquals("U", morseReader.morseToEnglish("..-"));
        assertEquals("V", morseReader.morseToEnglish("...-"));
        assertEquals("W", morseReader.morseToEnglish(".--"));
        assertEquals("X", morseReader.morseToEnglish("-..-"));
        assertEquals("Y", morseReader.morseToEnglish("-.--"));
        assertEquals("Z", morseReader.morseToEnglish("--.."));
    }

    @Test
    @DisplayName("Check that numbers are converted to morse code correctly")
    void testEnglishNumbersToMorse() {
        // Check all the numbers
        assertEquals(".----", morseReader.englishToMorse("1"));
        assertEquals("..---", morseReader.englishToMorse("2"));
        assertEquals("...--", morseReader.englishToMorse("3"));
        assertEquals("....-", morseReader.englishToMorse("4"));
        assertEquals(".....", morseReader.englishToMorse("5"));
        assertEquals("-....", morseReader.englishToMorse("6"));
        assertEquals("--...", morseReader.englishToMorse("7"));
        assertEquals("---..", morseReader.englishToMorse("8"));
        assertEquals("----.", morseReader.englishToMorse("9"));
        assertEquals("-----", morseReader.englishToMorse("0"));
    }

    @Test
    @DisplayName("Check that sentences are converted to morse code correctly")
    void testSentenceToMorse() {
        // Use hello world as a test
        assertEquals(".... . .-.. .-.. ---/.-- --- .-. .-.. -.. -.-.--", morseReader.englishToMorse("Hello World!"));
    }

    @Test
    @DisplayName("Check that morse code is converted to english correctly")
    void testMorseToSentence() {
        // Use hello world as a test
        assertEquals("HELLO WORLD!", morseReader.morseToEnglish(".... . .-.. .-.. ---/.-- --- .-. .-.. -.. -.-.--"));
        // Use hello as a test
        assertEquals("HELLO", morseReader.morseToEnglish(".... . .-.. .-.. ---"));
        // use punctuation as a test !?"
        assertEquals("HELLO WORLD!?", morseReader.morseToEnglish(".... . .-.. .-.. ---/.-- --- .-. .-.. -.. -.-.-- ..--.."));
    }
}