package multithreading.adderAndSubstractorDatatype;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor substractor = new Substractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(substractor);

        System.out.println("Enter to thread t1");
        t1.start();
        System.out.println("Enter to thread t2");
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The final value is : " + count.value);

    }
}
