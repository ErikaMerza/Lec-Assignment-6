public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // Now we use separate classes for generating invoice and sending notifications
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImp();
        invoiceGenerator.generateInvoice("order_123.pdf");

        NotificationSender notificationSender = new NotificationSenderImp();
        notificationSender.sendEmailNotification("johndoe@example.com");
    }
}
