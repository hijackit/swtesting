package it.units.inginf.guice;

public class ChargeResult {
	
	boolean success;
	String declineMessage;
	
	public ChargeResult(boolean success, String declineMessage){
		this.success = success;
		this.declineMessage = declineMessage;
	}

	public boolean wasSuccessful() {
		return success;
	}

	public String getDeclineMessage() {
		return declineMessage;
	}

}
