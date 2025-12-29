package multithreading.producerAndConsumer;

import java.util.Queue;

public class Consumer implements Runnable{

    private int maxSize;
    private String name;
    Queue<Object> store;

    public Consumer(int maxSize, String name, Queue<Object> store){
        this.maxSize = maxSize;
        this.name= name;
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() > 0) {
                    System.out.println(name + "Removing shirts: " + store.size());
                    store.remove();

                }
            }
        }
    }
}
