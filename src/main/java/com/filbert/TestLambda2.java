package com.filbert;

import java.util.function.Consumer;

public class TestLambda2 {
    public static void main(String[] args) {
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("diaonilaomu");
        System.out.println("***************");


        Consumer<String> con = System.out::println;
    }
}
