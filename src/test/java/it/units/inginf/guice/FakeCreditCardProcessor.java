package it.units.inginf.guice;

public class FakeCreditCardProcessor implements CreditCardProcessor {

	int chargedAmount;
	CreditCard chargedCreditCard;
	
	public ChargeResult charge(CreditCard creditCard, int amount) throws UnreachableException {
		chargedAmount = amount;
		chargedCreditCard = creditCard;
		return new ChargeResult(true, null);
	}

	public CreditCard getCardOfOnlyCharge() {
		return chargedCreditCard;
	}

	public int getAmountOfOnlyCharge() {
		return chargedAmount;
	}

}
