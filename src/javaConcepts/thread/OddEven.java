package javaConcepts.thread;

public class OddEven {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter(10);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}

class SharedPrinter {
    int limit;
    int counter=1;

    public SharedPrinter(int limit) {
        this.limit = limit;
    }

    synchronized void printOdd() {
        while(counter<limit){
            while(counter % 2==0){
                try{
                    wait();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Odd:" + counter);
            counter++;
            notify();
        }

    }

    synchronized void printEven() {
        while(counter<limit){
            while(counter%2==1){
                try{
                    wait();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Even:" + counter);
            counter++;
            notify();
        }

    }
}

