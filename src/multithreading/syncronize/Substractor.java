package multithreading.syncronize;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable{

    Count count;


    public Substractor(Count count1){

        count = count1;

    }

    @Override
    public void run() {
        for(int i=0; i<=10000; i++){
            synchronized (count) {
                count.value -= i;
            }
        }
    }
}
