package com.filbert;

public class Test5 {
    public static void main(String[] args) {

        System.out.println("你好，这是测试");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("");
            }
        }).start();
    }
}
