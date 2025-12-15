package multithreading.adderSubstractorMutex;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable{

    Count count;
    Lock lock;

    public Substractor(Count count1, Lock lock1) {
        count = count1;
        lock = lock1;
    }

    @Override
    public void run() {
        for(int i=0; i<=10000; i++){
            lock.lock();
            count.value -=i;
            lock.unlock();
        }
    }
}
