package it.units.inginf.guice;

public class TransactionLogFactory {
	
	private static TransactionLog instance;

	public static void setInstance(InMemoryTransactionLog transactionLog) {
		instance = transactionLog;
	}
	
	public static TransactionLog getInstance(){
		if(instance ==null){
			return new DatabaseTransactionLog();
		}
		
		return instance;
	}

}
