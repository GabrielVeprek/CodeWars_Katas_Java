package task.vowelCount;

import java.util.List;

public class VowelCounter {

    public int getCount(String input) {
        var vowels = List.of('a', 'e', 'i', 'o', 'u');

        return (int) input.chars()
                .mapToObj(ch -> (char) ch)
                .filter(vowels::contains)
                .count();
    }
}
