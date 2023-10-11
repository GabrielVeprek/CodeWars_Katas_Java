package task.ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordReverser {

    public String reverseWords(final String original) {

        return Arrays.stream(original.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
