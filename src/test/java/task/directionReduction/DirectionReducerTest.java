package task.directionReduction;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DirectionReducerTest {

    DirectionReducer directionReducer = new DirectionReducer();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{"NORTH", "SOUTH", "WEST"},
                        new String[]{"WEST"}),
                Arguments.of(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"},
                        new String[]{"WEST"}),
                Arguments.of(new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                        new String[]{"NORTH", "WEST", "SOUTH", "EAST"})


        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void dirReducer(String[] arr, String[] expected) {

        var actual = directionReducer.dirReduc(arr);

        Assert.assertArrayEquals(expected, actual);
    }
}