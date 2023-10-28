package task.squareNumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareNumberCheckerTest {
    SquareNumberChecker squareNumberChecker = new SquareNumberChecker();

    @ParameterizedTest
    @CsvSource({"false, -1",
            "true, 0",
            "false, 2",
            "false, 3",
            "true, 4",
            "true, 9",
            "true, 81"
    })
    public void testIsSquare(boolean expected, int number) {
        var result = squareNumberChecker.isSquare(number);

        assertEquals(expected, result);
    }
}