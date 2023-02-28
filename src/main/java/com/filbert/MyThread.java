package com.filbert;

public class MyThread extends Thread{

        public MyThread(String name){
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0;; i++) {
                System.out.println(getName() + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }