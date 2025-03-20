package javaConcepts.thread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }

    static class MyTask implements Runnable {
        public void run() {
            System.out.println("Runnable running: " + Thread.currentThread().getName());
        }
    }
}
