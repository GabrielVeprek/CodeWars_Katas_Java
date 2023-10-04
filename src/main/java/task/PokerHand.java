package task;

import java.util.Arrays;

public class PokerHand {
    boolean isFlush(String[] cards) {
        return cards.length == 5 && Arrays.stream(cards)
                .allMatch(card -> card.charAt(card.length() - 1) == cards[0].charAt(cards[0].length() - 1));
    }
}

