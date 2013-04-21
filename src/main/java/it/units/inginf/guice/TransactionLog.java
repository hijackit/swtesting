package it.units.inginf.guice;

public interface TransactionLog {

	void logChargeResult(ChargeResult result);

	void logConnectException(UnreachableException e);

	public boolean wasSuccessLogged();
}
