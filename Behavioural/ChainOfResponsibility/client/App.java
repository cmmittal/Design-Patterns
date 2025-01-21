package Behavioural.ChainOfResponsibility.client;

import Behavioural.ChainOfResponsibility.middleware.MiddleWare;
import Behavioural.ChainOfResponsibility.middleware.SecondMiddleWare;
import Behavioural.ChainOfResponsibility.middleware.ThirdMiddleWare;
import Behavioural.ChainOfResponsibility.middleware.FirstMiddleWare;

public class App {

    public static void main(String[] args) {
        MiddleWare middleWare = MiddleWare.link(
            new FirstMiddleWare(),
            new SecondMiddleWare(),
            new ThirdMiddleWare()
        );

        middleWare.execute();
    }
}
