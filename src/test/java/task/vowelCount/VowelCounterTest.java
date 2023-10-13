package task.vowelCount;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VowelCounterTest extends TestCase {

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