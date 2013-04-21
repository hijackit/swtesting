package it.units.inginf.guice;

public interface CreditCardProcessor {

	ChargeResult charge(CreditCard creditCard, int object) throws UnreachableException;

	CreditCard getCardOfOnlyCharge();
	
	int getAmountOfOnlyCharge();
}
