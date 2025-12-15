package multithreading.helloworldExample;

public class HelloWorldPrinter extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World  : " + Thread.currentThread());
    }
}
