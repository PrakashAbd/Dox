package sample;
public class sudoku 
{
	static int a[][] = { {8,0,0,0,0,0,0,0,0},{0,0,3,6,0,0,0,0,0},{0,7,0,0,9,0,2,0,0},
			  			 {0,5,0,0,0,7,0,0,0},{0,0,0,0,4,5,7,0,0},{0,0,0,1,0,0,0,3,0},
			  			 {0,0,1,0,0,0,0,6,8},{0,0,8,5,0,0,0,1,0},{0,9,0,0,0,0,4,0,0}
						};
	public static boolean find(int r,int c,int k)
	{
		for(int i=0;i<9;i++)	//to find whether the number is present in the current row
			if(a[r][i]==k)
				return false;
		
		for(int i=0;i<9;i++)	//to find whether the number is present in the current column
			if(a[i][c]==k)
				return false;

		int row = r-r%3;
		int col = c-c%3;
		for(int i=row;i<row+3;i++)	// to find whether the number is present in the 3*3 subsection matrix 
			for(int j=col;j<col+3;j++)
				if(a[i][j]==k)
					return false;
		
		return true;
		
	}

	public static boolean func()
	{
		for(int r= 0;r<9;r++)
		{
			for(int c=0;c<9;c++)
			{
				if(a[r][c]==0)
				{
					for(int k=1;k<=9;k++)
					{
						if(find(r,c,k))
						{
							a[r][c] = k;
							if(func())
								return true;
							else
								a[r][c] = 0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		if(func())
		{
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
					System.out.print(a[i][j]+" ");
				
				System.out.println();
			}
		}
		else
			System.out.println("Not Found");
	}		
}