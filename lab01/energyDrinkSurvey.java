class energyDrinkSurvey
{
	public static void main(String args[])
	{
		int totalSurveyed = 12467;

		// Calculate approximate number of customers who buy one or more drinks per week
		int DrinkCustomers = (int) (totalSurveyed * (14.0 / 100));
        	
        	// Calculate approximate number of customers who prefer citrus flavored energy drinks
        	int citrusDrinkCustomers = (int) (DrinkCustomers * (64.0 / 100));

		System.out.println("Approximate number of customers who purchase energy drinks per week: " + DrinkCustomers);
        	System.out.println("Approximate number of customers who prefer citrus flavored energy drinks: " + citrusDrinkCustomers);
    
	}
}