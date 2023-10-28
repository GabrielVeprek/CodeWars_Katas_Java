package task.banjo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BanjoPlayerTest {
    BanjoPlayer banjoPlayer = new BanjoPlayer();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Nope ? does not play banjo", "?"),
                Arguments.of("Nope ?R does not play banjo", "?R"),
                Arguments.of("Nope ??R does not play banjo", "??R"),
                Arguments.of("Yes R plays banjo", "R"),
                Arguments.of("Yes r plays banjo", "r")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testAreYouPlayingBanjo(String expected, String name) {
        var result = banjoPlayer.areYouPlayingBanjo(name);

        assertEquals(expected, result);
    }
}