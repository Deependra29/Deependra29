package multithreading.producerAndConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Client {
    public static void main(String[] args) {
       Queue<Object> store = new ConcurrentLinkedDeque<>();
    }
}
