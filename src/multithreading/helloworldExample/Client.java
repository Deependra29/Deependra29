package multithreading.helloworldExample;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter in the Thread");
        HelloWorldPrinter h = new HelloWorldPrinter();
        h.start();
        System.out.println("Exit the thread");
    }
}
