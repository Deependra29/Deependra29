package multithreading.producerAndConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private int maxSize;
    private String name;
    Queue<Object> store;
    private Semaphore producer;
    private Semaphore consumer;

    public Producer(int maxSize, String name, Queue<Object> store, Semaphore producer, Semaphore consumer) {
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
                producer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (store.size() < maxSize) {
                System.out.println(name + "Adding shirts: " + store.size());
                store.add(new Object());
            }
            consumer.release();
        }
    }
}
