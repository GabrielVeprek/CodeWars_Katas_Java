package task.vowelCount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCounterTest {

    VowelCounter vowelCounter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({"0,x",
            "1,a",
            "1,xa",
            "5, aeiou"})

    public void testGetCount(int expected, String input) {
        var result = vowelCounter.getCount(input);

        assertEquals(expected, result);
    }
}