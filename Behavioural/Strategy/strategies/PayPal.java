package Behavioural.Strategy.strategies;

public class PayPal implements PaymentStrategy{

    @Override
    public void pay(){
        System.out.println("Payment processed with PayPal");
    }
}
