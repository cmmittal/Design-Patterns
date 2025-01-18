package Behavioural.Strategy.client;

import Behavioural.Strategy.order.Order;

public class App {

    public static void main(String[] args) {
        Order order = new Order();

        order.processOrder("PayPal");
        order.processOrder("Credit Card");
    }
}
