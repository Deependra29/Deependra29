package interfaces.payments;

public class Card implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using card  ...................!");
    }
}