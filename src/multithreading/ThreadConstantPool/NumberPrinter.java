package multithreading.ThreadConstantPool;

public class NumberPrinter implements Runnable {
    int numberPrinter;
     NumberPrinter(int n){
        this.numberPrinter = n;
    }
    @Override
    public void run() {
        System.out.println("Number to print : " + numberPrinter+" "+Thread.currentThread().getName());
    }
}
