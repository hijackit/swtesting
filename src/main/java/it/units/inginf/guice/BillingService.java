package it.units.inginf.guice;

public interface BillingService {
	
	public Receipt chargeOrder(PizzaOrder order, CreditCard card);
}
