class Armstrong
{
	public static void main(String args[])
	{
		int lowerLimit = 1;
		int upperLimit = 200;
		int number , digit ,sum;
		
		for(int i = lowerLimit ; i <= upperLimit ; i++)
		{	sum = 0;
			number = i;
			while(number > 0)
			{
				digit = number % 10;
				sum = sum + (digit * digit * digit);
				number = number / 10;
			}
			if(sum == i)
			{ System.out.print(i + "  "); }
		}
	}
}