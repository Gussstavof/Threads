package org.example;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArithmeticAverageTask.result(List.of(
                300000, 1000, 1000, 1000,
                1000, 300000, 300000, 300000
        ));

        ArithmeticAverageTask.result(List.of(5, 5));

        ArithmeticAverageTask.result(List.of(1, 2, 3, 4));

        for (int i = 0; i < 10; i++) {
            new Thread(new ListTask("Thread" + i)).start();
        }

        new Thread(() -> {
            synchronized (ListTask.strings) {
                try {
                    ListTask.strings.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            ListTask.strings.forEach(System.out::println);
        }).start();
    }
}