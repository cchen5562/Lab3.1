
public class ArrayMethods1 
{
	public static void bubbleSort(String[] list1)
	{
			//while(swap > 0)
			//swap = 0;
			//start with the first two numbers and check if the first number is less than second
			//if not, swap, swap++
			//then move on to the next two consecutive numbers
		int c = list1.length; //for the array loop
		for(int a = 0; a < c - 1; a++)			//this one the one being checked
		{
			for(int b = 0; b < c - 1; b++)		//this is the temp place holder
			{
				if (list1[b] > list1[b+1])
				{
					swap(list1, b, b + 1);
				}
			}
		} 
	}
	
	public static void selectionSort(double[] list1)
	{
		//first loop loops through index (length of array)
		//second loop checks for the smallest number
		//swap index if it checks against a smaller number
		int z = list1.length;
		for(int x = 0; x < z - 1; x++) 			//minus one because if it goes through the length it will be out of bounds
		{
			for(int y = 0; y < z - 1; y++)
			{
				if(list1[y] > list[y + 1])
				{
					swap(list1, y, y + 1);
				} 
			}
		}
	}
	
	public static void insertionSort(int[] list1)   //while loop inside of a while loop needed
	{
		int i = 0;
		int j = i + 1;
	
		while(j < list1.length)
		{
			if(i > j)
			{
				swap(list1, i, j);
			}
			
			if(i < j)
			{
				j++;
			}
		}
	}
	
	public static void swap(int[]arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(double[]arr, int index1, int index2)
	{
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(String[]arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
