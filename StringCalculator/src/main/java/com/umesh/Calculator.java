package com.umesh;

public class Calculator {


    public int calculate(String input) {
        String[] numbers = input.split(",|\n");
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInteger(input);
        } else {
            return getSum(numbers);
        }

    }

    private int getSum(String[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += stringToInteger(numbers[i]);
        }
        return sum;
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();

    }

    private int stringToInteger(String input) {
        return Integer.parseInt(input);

    }

}
