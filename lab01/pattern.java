class pattern{
	
	public static void main(String args[])
	{
		int rows = 7;
		int columns = 14;
		int levels = 0;

		for(int i = 0; i < rows ; i++)
		{
			int count = 1;
			for(int j = 0 ; j < columns/2 ; j++)
			{
				if(j % 2 != 0 && count <= levels)
				{
					System.out.print(" ");			
					count++;
				}
	
				else if( i == rows/2 && j >= 2*levels)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			for(int k = columns/2 ; k < 14 ; k++)
			{
				if(k < columns - 2*levels && i != rows/2 )
				{
					System.out.print("*");			
				}
				else if( i == rows/2 && k < columns-2*levels)
				{
					System.out.print(" ");
				}
				else
				{
					if(k%2 == 0)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
					
				}
			}
				if(i >= rows/2)
				{
					levels = (rows-1)-i-1;
				}
				else
				{ levels++; }
				System.out.println();
		}

	}
}