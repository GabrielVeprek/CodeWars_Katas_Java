package task.BackSpaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class backspaceTest {
    backspace backspace = new backspace();

    public static Stream<Arguments> param() {
        return Stream.of(
                Arguments.of("abc#d##c", "ac"),
                Arguments.of("abc##d######", ""),
                Arguments.of("#######", ""),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("param")
    void cleanString(String input, String expected) {
        var actual = backspace.cleanString(input);

        Assertions.assertEquals(actual, expected);
    }
}