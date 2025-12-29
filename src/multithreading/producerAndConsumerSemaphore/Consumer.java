package multithreading.producerAndConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private int maxSize;
    private String name;
    Queue<Object> store;
    private Semaphore producer;
    private Semaphore consumer;

    public Consumer(int maxSize, String name, Queue<Object> store, Semaphore producer, Semaphore consumer) {
        this.maxSize = maxSize;
        this.name = name;
        this.store = store;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (store.size() > 0) {
                System.out.println(name + "Removing shirts: " + store.size());
                store.remove();
            }
            producer.release();
        }
    }
}
