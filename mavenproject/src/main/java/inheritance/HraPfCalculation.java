package inheritance;

public class HraPfCalculation extends PaymentP {
	double hra;
	double pf;
	public void calculation() {
		hra = basicPay * .05;
		pf = basicPay * .2;
	}

}
