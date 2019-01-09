package Frst2weeks;
import java.util.Scanner;
public class MATRIXARRANGEMENT
{
	static int ARRAY_SIZE;
	public static void bubbleSort(int tempArray[])
	{
		for(int i=0;i<tempArray.length-1;i++)	
		{
			for(int j=0;j<tempArray.length-i-1;j++)			//Sorting a single dimensional array in ascending order
			{
				if(tempArray[j]>tempArray[j+1])
				{
					int temp = tempArray[j];
					tempArray[j] = tempArray[j+1];
					tempArray[j+1] = temp;
				}
			}
		}		
	}
	public static int [ ] arrangeElements(int[ ] [] inputArray) 
	{ 
		int tempArray[] = new int[ARRAY_SIZE*ARRAY_SIZE];
		int resultArray[] = new int[tempArray.length];
		int index = 0;
		for(int i=0;i<ARRAY_SIZE;i++)						//Stored in a single dimensional array
			for(int j=0;j<ARRAY_SIZE;j++)
				tempArray[index++] = inputArray[i][j];
		
		bubbleSort(tempArray);								//Calling the bubbleSort Function
		
		int i = tempArray.length/2;							//Storing the mid-value of an array
		int j = i-1;
		resultArray[i++] = tempArray[0];		
		for(int k=1;k<tempArray.length;k++)					//Storing the values in the resultArray
		{
			if(k%2!=0)
				resultArray[i++] = tempArray[k];
			else
				resultArray[j--] = tempArray[k];
		}	
		return resultArray;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		ARRAY_SIZE = s.nextInt();
		int array1[][] = new int[ARRAY_SIZE][ARRAY_SIZE];
		
		for(int i=0;i<ARRAY_SIZE;i++)						//Getting a values from the user
			for(int j=0;j<ARRAY_SIZE;j++)
				array1[i][j] = s.nextInt();
		
		int resultArray[] = arrangeElements(array1);		//Calling the arrangeElemnets method
		
		for (int i = 0; i < resultArray.length; i++)		//Printing the result array 
			System.out.print(resultArray[i]+" ");
		
		s.close();
	}
}