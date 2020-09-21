public interface PaymentGateway {
    String description = "UPI Transaction";
    void pay(long from, long to, double amount);
}