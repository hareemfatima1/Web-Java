class annualPay
{
	public static void main(String args[])
	{
		double payAmount = 2000.00; // Amount earned each pay period
        	int payPeriods = 12; // Number of pay periods in a year
        	double annualPay; // Total annual pay

        	// Calculate total annual pay
       	 	annualPay = payAmount * payPeriods;

        	// Display the total annual pay
        	System.out.println("Total annual pay: $" + annualPay);
	}
}
