package multithreading.producerAndConsumer;

import java.util.Queue;

public class Producer implements Runnable {

    private int maxSize;

    private String name;
    Queue<Object> store;

    public Producer(int maxSize, String name, Queue<Object> store) {
        this.maxSize = maxSize;
        this.name = name;
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() < maxSize) {
                    System.out.println(name + "Adding shirts: " + store.size());

                    store.add(new Object());
                }
            }
        }
    }
}
