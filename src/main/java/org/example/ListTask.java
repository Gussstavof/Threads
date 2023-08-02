package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListTask implements Runnable{

    //public static List<String> strings = new ArrayList<>();
    public static List<String> strings = new Vector<>();
    //public static List<String> strings =  Collections.synchronizedList(new ArrayList<>());

    private String thread;

    public ListTask(String thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            strings.add(i + " - " + thread + " - " + i);
        }
    }
}
