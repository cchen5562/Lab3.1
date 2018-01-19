
public class ArrayMethods1 
{
	public static void bubbleSort(String[] list1)
	{
		int m = 0;  //does m and n go inside or outside the loop?
		int n = m + 1;
		while(m < list1.length)
		{ 
			if( > n) 
			{
			swap(list1, m, n);
			}
		} m++;
	}
	
	public static void selectionSort(double[] list1)
	{
		int x = 0;
		int y = x + 1;
		while(x < y)
		{ 
			swap(list1, x, y);
		} x++;
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
