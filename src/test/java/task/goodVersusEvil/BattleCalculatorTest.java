package task.goodVersusEvil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class BattleCalculatorTest {

    BattleCalculator battleCalculator = new BattleCalculator();

    public static Stream<Arguments> parameters() {
        return Stream.of(
               of("0 0 0 0 9 10", "0 0 0 0 0 10 10", "Battle Result: Evil eradicates all trace of Good"),
                of("0 0 0 0 10 20", "0 0 0 0 0 9 10", "Battle Result: Good triumphs over Evil"),
                of("1 0 0 0 0 0", "1 0 0 0 0 0 0", "Battle Result: No victor on this battle field"),
                of("4975 4768 5815 396 5238 2216", "5064 1117 6023 4744 9445 2 771", "Battle Result: Good triumphs over Evil")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void predictWinner(String goodAmount, String evilAmount, String expected) {
        var actual = battleCalculator.predictWinner(goodAmount, evilAmount);

        assertEquals(expected, actual);
    }
}