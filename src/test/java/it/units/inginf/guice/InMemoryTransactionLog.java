package it.units.inginf.guice;

public class InMemoryTransactionLog implements TransactionLog {
	
	boolean charged;

	public void logChargeResult(ChargeResult result) {
		charged = true;
	}

	public void logConnectException(UnreachableException e) {

	}

	public boolean wasSuccessLogged() {
		return charged;
	}

}
