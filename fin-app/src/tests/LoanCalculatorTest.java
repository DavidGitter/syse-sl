package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import app.LoanPayBack;
import app.LoanCalculator;

public class LoanCalculatorTest {
	
	@Test
	@DisplayName("Testing calculatePayback with specific parametes")
	public void testLoanCalculator()  {
		LoanPayBack lpb = LoanCalculator.calculatePayback(100000, 6, 12);
		assertEquals(8833.333333333334, lpb.getMonthlyRate(), "Test failed duo to not-matching: monthly rate");
		assertEquals(12, lpb.getNumberOfRates(), "Test failed duo to not-matching: number of rates");
		assertEquals(106000.0, lpb.getOverAllDebt(), "Test failed duo to not-matching: overall debt");
	}
}
