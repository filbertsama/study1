package com.filbert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread3 implements Callable {
    @Override
    public Object call() throws Exception {
        boolean flag = false;
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 3; i < 100; i++) {
            flag = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i%j == 0) {
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                lists.add(i);
            }

        }
        return lists;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread3 thread3 = new Thread3();
        FutureTask futureTask = new FutureTask<>(thread3);
        new Thread(futureTask).start();
        List<Integer> lists = (List<Integer>) futureTask.get();
        for (Integer list : lists) {
            System.out.println(list);
        }

    }
}
