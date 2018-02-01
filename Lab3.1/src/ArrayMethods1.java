import java.util.Arrays;

//Cristina Chen
// 02-01-18
//Array Methods Lab 3.1

public class ArrayMethods1 
{
	//testing code
	public static void main(String[] args)
	{
		//testing arrays
		String [] test1 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		double [] test2 = { 1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		int [] test3 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		
		//bubble sort test
		long start = System.nanoTime();
		bubbleSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		//selection sort test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		//insertion sort test
		start = System.nanoTime();
		insertionSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));
	}
	
	//reference: geeksforgeeks.org and Joyin
	public static void bubbleSort(String[] list1)
	{
			//pseudo-code
				//while(swap > 0)
				//swap = 0;
				//start with the first two numbers and check if the first number is less than second
				//if not, swap, swap++
				//then move on to the next two consecutive numbers
		
		int c = list1.length; 					//for the array loop
		for(int a = 0; a < c - 1; a++)			//this is swap counter?
		{
			for(int b = 0; b < c - 1; b++)		//this is the one being checked
			{
				if (list1[b].compareTo(list1[b+1]) > 0)	//Joyin helped me with this one, compareTo: if it returns a 
														//positive number it means that the first string is "greater" than the second string
														//comes first in the alphabet
				{
					swap(list1, b, b + 1);
				}
			}
		} 
	}
	
	
	public static void selectionSort(double[] list2)
	{
		//psuedo code
		//first loop loops through index (length of array)
		//second loop checks for the smallest number
		//swap index if it checks against a smaller number
		
		int z = list2.length;
		for(int x = 0; x < z - 1; x++) 			//this loop goes through the array
		{
			for(int y = 0; y < z - 1; y++)		//checks for the smallest number
			{
				if(list2[y] > list2[y + 1])
				{
					swap(list2, y, y + 1);		//the temp inside swap is the minimum
				} 
			}
		}
	}
	
	public static void insertionSort(int[] list3)   //while loop inside of a while loop needed
	{
		int k = list3.length;
		for(int i = 0; i < k - 1; k++)
		{
			for(int j = 0; j < k - 1; k++)
			{
				
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
