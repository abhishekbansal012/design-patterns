package com.frontalx.patterns.structural.facade;

public class OrderFacade {

    private InventoryService inventoryService = new InventoryService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();
    private NotificationService notificationService = new NotificationService();

    public void placeOrder(String productId, String customerId, double amount) {
        System.out.println("Placing order for customer: " + customerId);

        if (inventoryService.checkStock(productId)) {
            if (paymentService.processPayment(customerId, amount)) {
                shippingService.shipOrder(productId, customerId);
                notificationService.sendOrderConfirmation(customerId);
                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Payment failed. Order not placed.");
            }
        } else {
            System.out.println("Product out of stock. Order not placed.");
        }
    }

}
