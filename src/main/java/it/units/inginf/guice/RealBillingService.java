package it.units.inginf.guice;

public class RealBillingService implements BillingService {

	//	CreditCardProcessor processor;
	//	TransactionLog transactionLog;

	//		public RealBillingService(CreditCardProcessor processor,
	//				TransactionLog transactionLog){
	//			// ...
	//		}

	public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
		// Testability ???
		// Modularity ???
		CreditCardProcessor processor = new PaypalCreditCardProcessor();
		TransactionLog transactionLog = new DatabaseTransactionLog();

		// Factories?
		// CreditCardProcessor processor = CreditCardProcessorFactory.getInstance();
		// TransactionLog transactionLog = TransactionLogFactory.getInstance();

		try {
			ChargeResult result = processor.charge(creditCard, order.getAmount());
			transactionLog.logChargeResult(result);

			return result.wasSuccessful()
					? Receipt.forSuccessfulCharge(order.getAmount())
					: Receipt.forDeclinedCharge(result.getDeclineMessage());
		} catch (UnreachableException e) {
			transactionLog.logConnectException(e);
			return Receipt.forSystemFailure(e.getMessage());
		}

	}

}
