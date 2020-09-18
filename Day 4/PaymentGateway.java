interface PaymentGateway {
	void payment(long source, long destination, double amount);
}