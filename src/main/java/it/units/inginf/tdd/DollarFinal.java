package it.units.inginf.tdd;

public class DollarFinal {

	public int amount;

	public DollarFinal(int amount) {
		 this.amount = amount;
	}

	public DollarFinal times(int multiplier) {
		return new DollarFinal(amount * multiplier);
	}

	public boolean equals(Object o){
		return ((DollarFinal)o).amount == amount;
	}
}
