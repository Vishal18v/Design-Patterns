package javaConcepts.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorPoolThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a long-running task
        Future<String> future = executor.submit(() -> {
            System.out.println("Task is running...");
            Thread.sleep(3000); // Simulating delay
            return "Task Completed!";
        });

        // Main thread moves ahead immediately
        System.out.println("Main thread continues execution...");

        // Now we wait for the result (blocking)
        String result = future.get(); // Blocks until the task is done

        System.out.println("Received result: " + result);

        executor.shutdown();
    }
}
