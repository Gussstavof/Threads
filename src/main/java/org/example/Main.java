package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers1 = List.of(1000,300000,1000,1000,1000,1000,300000,300000,300000);

        List<Integer> numbers = List.of(1,2,3,4);

        List<Integer> numbers2 = List.of(5,5);

        ArithmeticAverageTask.result(numbers1);

        ArithmeticAverageTask.result(numbers);

        ArithmeticAverageTask.result(numbers2);
    }
}