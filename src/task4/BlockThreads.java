package task4;

public class BlockThreads {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Thread thread1 = new Thread(() -> {
            try {
                worker.BlockUntilDone();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                worker.BlockUntilDone();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> worker.doOnce());


        thread1.start();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(100);
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

    }
}

class Worker {
    private boolean allow = false;

    public void BlockUntilDone() throws InterruptedException {
        synchronized (this) {
            System.out.println("Thread " + Thread.currentThread().getName() + " enter to BlockUntilDone() method");
            wait();
            System.out.println("Thread " + Thread.currentThread().getName() + " continue to work");
        }
    }

    public void doOnce() {
        synchronized (this) {
            System.out.println("Thread " + Thread.currentThread().getName() + " allows others to continue to work");
            notifyAll();
        }
    }
}
