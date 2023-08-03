package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers1 = List.of(1000,300000,1000,1000,1000,1000,300000,300000,300000);

        List<Integer> numbers = List.of(1,2,3,4);

        List<Integer> numbers2 = List.of(5,5);

        ArithmeticAverageTask.result(numbers1);

        ArithmeticAverageTask.result(numbers);

        ArithmeticAverageTask.result(numbers2);

        Thread.sleep(2000);


        for (int i = 0; i < 1000; i++) {
           new Thread(new ListTask("Thread"+i)).start();
        }

        Thread.sleep(2000);

        ListTask.strings.stream()
                .filter(Objects::isNull)
                .forEach(System.out::println);
    }
}