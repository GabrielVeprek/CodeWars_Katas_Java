package task.validatePin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinValidatorTest {
    PinValidator pinValidator = new PinValidator();

    @ParameterizedTest
    @CsvSource({"false, 1",
            "false, a",
            "false, 123",
            "false, 12345",
            "false, XXXX",
            "false, xxxxxx",
            "false, .234",
            "true, 1234",
            "true, 123456"})

    public void testValidator(boolean expected, String pin) {
        var result = pinValidator.validator(pin);

        assertEquals(expected, result);
    }
}