package task.reverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordReverser {

    public String reverseWords(String original) {

        if (original.isBlank()) {
            return original;
        }

        return Arrays.stream(original.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
