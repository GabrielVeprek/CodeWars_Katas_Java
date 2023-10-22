package task.reverseWords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverserTest {
    WordReverser wordReverser = new WordReverser();

    @ParameterizedTest
    @CsvSource({"'  ','  '",
            "sihT si a tseT,This is a Test",
            "elbuod  decaps  sdrow, double  spaced  words"})

    public void testReverseWords(String expected, String original) {
        String result = wordReverser.reverseWords(original);

        assertEquals(expected, result);
    }
}