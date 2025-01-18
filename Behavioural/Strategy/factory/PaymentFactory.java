package Behavioural.Strategy.factory;

import Behavioural.Strategy.strategies.CreditCard;
import Behavioural.Strategy.strategies.PayPal;
import Behavioural.Strategy.strategies.PaymentStrategy;

public class PaymentFactory {

    public PaymentStrategy getPaymentStrategy(String paymentString){
        PaymentStrategy paymentStrategy;
        if (paymentString.equals("PayPal")) {
            paymentStrategy = new PayPal();
        }
        else{
            paymentStrategy = new CreditCard();
        }
        return paymentStrategy;
    }
}
