package com.umesh;

public class Calculator {
    private final String delimiter = ",|\n";

    public int calculate(String input) throws Exception {
        String[] numbers = input.split(delimiter);
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInteger(input);
        } else {
            return getSum(numbers);
        }

    }

    private int getSum(String[] numbers) throws Exception {
        findDangerousException(numbers);

        return calculateVlaue(numbers);
    }

    private int calculateVlaue(String[] numbers) {
        int sum = 0;
        for (String i : numbers) {
            if (stringToInteger(i) > 1000) {
                continue;
            }
            sum += stringToInteger(i);
        }
        return sum;
    }

    private void findDangerousException(String[] numbers) throws Exception {
        for (String i : numbers) {
            if (stringToInteger(i) < 0) {
                throw new Exception("Negative input");
            }
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();

    }

    private int stringToInteger(String input) {
        return Integer.parseInt(input);

    }

}

