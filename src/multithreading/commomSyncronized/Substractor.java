package multithreading.commomSyncronized;

public class Substractor implements Runnable{

    Count count;

    public Substractor(Count count1){
        count = count1;

    }

    @Override
    public void run() {
        for(int i=0; i<=10000; i++){
            count.increamentValue(i);

        }
    }
}
