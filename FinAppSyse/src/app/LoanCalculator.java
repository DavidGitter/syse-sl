package app;

public class LoanCalculator {
	public static LoanPayBack calculatePayback
			(		double debtValue, 
					double interestRatePerc, 
					int durationMonths			) {
		double interestCosts = debtValue * interestRatePerc / 100;
		double totalDebt = debtValue + interestCosts;
		double monthlyRate = totalDebt / durationMonths;
		
		
		return new LoanPayBack(monthlyRate, durationMonths, totalDebt);
	}
}
