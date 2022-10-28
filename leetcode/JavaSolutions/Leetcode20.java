package leetcode.javaSolutions;

import java.util.Stack;

class Leetcode20 {
    public boolean isValid(String s) {

        if ((s.length() % 2) != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character c = s.charAt(i);

            switch (c) {
                case (')'):
                case (']'):
                case ('}'): {
                    if (!stack.isEmpty()) {
                        if (!stackHelper(stack, c))
                            return false;
                    } else
                        return false;
                    break;
                }
                default: {
                    stack.add(c);
                }
            }

        } // end of for loop

        return stack.isEmpty();
    }

    private boolean stackHelper(Stack<Character> stack, Character c) {

        switch (c) {
            case (')'): {
                if (stack.peek().equals('(')) {
                    stack.pop();
                    return true;
                }
                break;

            }
            case (']'): {
                if (stack.peek().equals('[')) {
                    stack.pop();
                    return true;
                }
                break;
            }
            case ('}'): {
                if (stack.peek().equals('{')) {
                    stack.pop();
                    return true;
                }
                break;
            }
        }
        return false;
    }
}