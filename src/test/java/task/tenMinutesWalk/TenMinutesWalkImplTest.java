package task.tenMinutesWalk;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TenMinutesWalkImplTest extends TestCase {


    TenMinutesWalkImpl tenMinutesWalk = new TenMinutesWalkImpl();

    public static Stream<Arguments> parameter() {

        return Stream.of(
                Arguments.of(false, new char[]{'n'}),
                Arguments.of(false, new char[]{'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n'}),
                Arguments.of(false, new char[]{'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n'}),
                Arguments.of(true, new char[]{'n', 'n', 'n', 'n', 'n', 's', 's', 's', 's', 's'}),
                Arguments.of(true, new char[]{'n', 'n', 'e', 'e', 'w', 's', 's', 'w', 'w', 'e'})
        );
    }

    @ParameterizedTest
    @MethodSource("parameter")
    public void testIsValid(boolean expected, char[] words) {
        boolean result = tenMinutesWalk.isValid(words);

        Assertions.assertEquals(expected, result);
    }
}