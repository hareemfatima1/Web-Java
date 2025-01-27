class cake
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 11 ; i++)
		{
			for(int j = 1 ; j <= 10; j++)
			{
				if(i>=1 && i <5)
				{
					if(j>= 10/2-1 && j <= 10/2 +1)
					{
						if(i==1)
						{
							System.out.print("&");
						}
						else
						{System.out.print("|");}
						
					}
					else
					{ System.out.print(" "); }
				}
				else if(i>=5 && i <= 8)
				{
					if(j ==1 || j == 2 || j == 11-1 || j == 11-2)
					{
						System.out.print(" ");
					}
					else
					{ System.out.print("*"); }
				}
				else
				{
					System.out.print("*");
				}
				
			}
				System.out.println();
		}
	
	}

}