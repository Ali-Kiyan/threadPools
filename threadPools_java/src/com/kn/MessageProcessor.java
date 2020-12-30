package com.kn;

public class MessageProcessor implements  Runnable{
    private int message;
    public MessageProcessor(int message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Received message: "+ message);
        respondToMessage(); //make the thread sleep to do some work
        System.out.println(Thread.currentThread().getName() + "Processing message Done: " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
