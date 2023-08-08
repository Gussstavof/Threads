package org.example;

import java.util.List;

public class ArithmeticAverageTask {
    public static synchronized void result(List<Integer> numbers) {
        new Thread(() -> {
            System.out.println(
                    numbers.stream()
                            .mapToInt(Integer::intValue)
                            .sum() / numbers.size()
            );
        }, "ArithmeticAverageTask").start();
    }
}
