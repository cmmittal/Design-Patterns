package Behavioural.Strategy.order;

import Behavioural.Strategy.factory.PaymentFactory;
import Behavioural.Strategy.strategies.PaymentStrategy;

public class Order {

    PaymentFactory paymentFactory = new PaymentFactory();

    public void processOrder(String payment){
        PaymentStrategy paymentStrategy = paymentFactory.getPaymentStrategy(payment);
        paymentStrategy.pay();
    }
}
