package multithreading.adderAndsubstructor;

public class Substractor implements Runnable{

    Count count;
    Substractor(Count count1){
        count = count1;
    }

    @Override
    public void run() {

        for(int i = 0; i<=10000; i++){
            count.value -= i;
        }
    }
}
