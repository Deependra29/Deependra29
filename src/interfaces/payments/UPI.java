package interfaces.payments;

public class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("This is UPI method..................!");

    }
}