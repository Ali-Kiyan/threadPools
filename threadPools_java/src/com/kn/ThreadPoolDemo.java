package com.kn;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        // run 2 threads with executor
        ExecutorService executor = Executors.newFixedThreadPool(2); // recycle threads
        //message list
        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);
        Runnable processor2 = new MessageProcessor(3);
        executor.execute(processor2);
        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);
        Runnable processor4 = new MessageProcessor(5);
        executor.execute(processor4);
        Runnable processor5 = new MessageProcessor(6);
        executor.execute(processor5);

        // Rejects any new tasks being submitted
        executor.shutdown();
        while(!executor.isTerminated()){

        }
        System.out.println("All tasks submitted");
    }
}
