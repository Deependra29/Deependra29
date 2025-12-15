package multithreading.ThreadConstantPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

      //  ExecutorService executorService = Executors.newFixedThreadPool(10);
           ExecutorService executorService1 = Executors.newCachedThreadPool();

        for (int i = 0; i <= 100; i++) {
            if (i == 100) {
                System.out.println("Waiting");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
          //  executorService.execute(numberPrinter);
             executorService1.execute(numberPrinter);
        }
    }
}
