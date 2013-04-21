package it.units.inginf.guice;

public class Receipt {
	
	boolean successfulCharge;
	String declinedMessage;
	int amountOfCharge;
	
	public static Receipt forSuccessfulCharge(int amount) {
		Receipt receipt = new Receipt();
		receipt.successfulCharge = true;
		receipt.amountOfCharge = amount;
		return receipt;
	}

	public static Receipt forDeclinedCharge(String declineMessage) {
		Receipt receipt = new Receipt();
		receipt.successfulCharge = false;
		receipt.amountOfCharge = 0;
		receipt.declinedMessage = declineMessage;
		return receipt;
	}

	public static Receipt forSystemFailure(String message) {
		Receipt receipt = new Receipt();
		receipt.successfulCharge = false;
		receipt.amountOfCharge = 0;
		receipt.declinedMessage = message;
		return receipt;
	}

	public boolean hasSuccessfulCharge() {
		return successfulCharge;
	}

	public int getAmountOfCharge() {
		return amountOfCharge;
	}

}
