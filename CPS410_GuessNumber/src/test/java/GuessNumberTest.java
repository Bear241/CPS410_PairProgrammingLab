import org.example.GuessNumber;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberTest {

    @Test
    public void isInteger_nullNumber_returnsFalse() {
        assertFalse(GuessNumber.isInteger(null));
    }

    @Test
    public void isInteger_emptyNumber_returnsFalse() {
        assertFalse(GuessNumber.isInteger(""));
    }

    @Test
    public void isInteger_numberIsInteger_returnsTrue() {
        assertTrue(GuessNumber.isInteger("1"));
    }

    @Test
    public void isInteger_notAnInteger_returnsFalse() {
        assertFalse(GuessNumber.isInteger("a"));
    }

    @Test
    public void guessNumber_numberAboveRange_returnsFalse() {
        assertFalse(GuessNumber.guessNumber("101", "50"));
    }

    @Test
    public void guessNumber_numberBelowRange_returnsFalse() {
        assertFalse(GuessNumber.guessNumber("0", "50"));
    }

    @Test
    public void guessNumber_guessAboveRange_returnsFalse() {
        assertFalse(GuessNumber.guessNumber("50", "101"));
    }

    @Test
    public void guessNumber_guessBelowRange_returnsFalse() {
        assertFalse(GuessNumber.guessNumber("50", "0"));
    }

    @Test
    public void guessNumber_numberNotGuessed_returnsFalse() {
        assertFalse(GuessNumber.guessNumber("12", "32"));
    }

    @Test
    public void guessNumber_numberCorrectlyGuessed_returnsTrue() {
        assertTrue(GuessNumber.guessNumber("12", "12"));
    }
}
