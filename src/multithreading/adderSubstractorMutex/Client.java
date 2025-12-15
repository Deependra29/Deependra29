package multithreading.adderSubstractorMutex;

import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();

       Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Substractor substractor = new Substractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(substractor);

        t1.join();
        t2.join();

        System.out.println("The final value is : " + count.value);
    }
}
