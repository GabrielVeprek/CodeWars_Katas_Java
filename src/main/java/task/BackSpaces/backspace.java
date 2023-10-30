package task.BackSpaces;

import java.util.Stack;

public class backspace {

    public String cleanString(String s) {
        Stack<Character> stack = new Stack<>();

        for (var letter : s.toCharArray()) {
            if (letter == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(letter);
            }
        }

        StringBuilder result = new StringBuilder();

        for (var c : stack) {
            result.append(c);
        }

        return result.toString();
    }

}
