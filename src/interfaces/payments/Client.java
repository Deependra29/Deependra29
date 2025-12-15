package interfaces.payments;

public class Client {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
        System.out.println("Address : "+p);
        p= new Card();
        p.pay();
    }
}
