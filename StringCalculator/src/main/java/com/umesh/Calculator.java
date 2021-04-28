package com.umesh;

public class Calculator {
    public int calculate(String input) {
        if (isEmpty(input)) {
            return 0;
        }
        return stringToInteger(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int stringToInteger(String input) {
        return Integer.parseInt(input);

    }

}
