
public class LoanPayBack {
	public double getMonthlyRate() {
		return monthlyRate;
	}
	
	public int getNumberOfRates() {
		return numberOfRates;
	}
	
	public double getOverAllDebt() {
		return overAllDebt;
	}
	
	@Override
	public String toString() {
		return "monthly rate: \t\t" + getMonthlyRate() + " €\n" +
			   "number of rates: \t" + getNumberOfRates() + "\n" +
			   "over all debts: \t" + getOverAllDebt() + " €\n";
	}
	
	public LoanPayBack(double monthlyRate, int numberOfRates, double overAllDebt) {
		super();
		this.monthlyRate = monthlyRate;
		this.numberOfRates = numberOfRates;
		this.overAllDebt = overAllDebt;
	}

	private double monthlyRate;
	private int numberOfRates;
	private double overAllDebt;
}
