package com.umesh;

public class Calculator {


    public int calculate(String input) {
        String[] numbers = input.split(",");
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInteger(input);
        } else {
            return stringToInteger(numbers[0]) + stringToInteger(numbers[1]);
        }

    }

    private boolean isEmpty(String input) {
        return input.isEmpty();

    }

    private int stringToInteger(String input) {
        return Integer.parseInt(input);

    }

}
