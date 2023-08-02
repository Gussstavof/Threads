package org.example;

import java.util.List;

public class ArithmeticAverageTask {
    public static void result(List<Integer> numbers) {
        new Thread(() -> {
            var total = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println(total / numbers.size());
        }, "ArithmeticAverageTask").start();
    }
}
