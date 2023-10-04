package task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {
    PokerHand pokerHand = new PokerHand();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(false, new String[]{"?S"}),
                Arguments.of(false, new String[]{"?S", "?S"}),
                Arguments.of(false, new String[]{"?S", "?S", "?S",}),
                Arguments.of(false, new String[]{"?S", "?S", "??S", "?S",}),
                Arguments.of(false, new String[]{"??S", "?S", "??S", "?S", "?D"}),
                Arguments.of(false, new String[]{"??S", "?S", "??S", "?S", "?S", "?S"}),
                Arguments.of(true, new String[]{"??S", "?S", "??S", "?S", "?S"})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testIsFlash(boolean expected, String[] hand) {
        var result = pokerHand.isFlush(hand);

        assertEquals(expected, result);
    }
}