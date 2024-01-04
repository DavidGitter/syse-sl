
public class Main {

	public static void main(String[] args) {
		double debtValue = Double.parseDouble(args[1]);
		double interestRate = Double.parseDouble(args[2]);
		int paybackDurationMonths = Integer.parseInt(args[3]);
		
		//Test
//		double debtValue = 100000;
//		double interestRate = 6;
//		int paybackDurationMonths = 12;
		
		LoanPayBack lpb = LoanCalculator.calculatePayback(debtValue, interestRate, paybackDurationMonths);
		System.out.println(lpb);
	}

}
