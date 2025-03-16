package com.frontalx.patterns.structural.facade;

public class FacadePatternEcommerce {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("P12345", "C56789", 2999.50);
    }

}
