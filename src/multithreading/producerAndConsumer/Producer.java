package multithreading.producerAndConsumer;

import java.util.Objects;
import java.util.Queue;

public class Producer implements Runnable{

    private int maxSize;
    private String name;
    Queue<Objects> store;

    public Producer(int maxSize, String name, Queue<Objects> store){
        this.maxSize = maxSize;
        this.name = name;
        this.store = store;

    }
    @Override
    public void run() {
        if(store.size()){

        }
    }
}
