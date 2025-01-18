package Behavioural.Strategy.strategies;

public class CreditCard implements PaymentStrategy{

    @Override
    public void pay(){
        System.out.println("Payment processed with Credit Card");
    }
}
