package Sorting_In_Java;
import java.util.Scanner;
public class QuickSort
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements of array.");
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextInt();
		quickSort(array,0,array.length-1);
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i]+" ");
	}

	public static void quickSort(int[] array, int start, int end) 
	{
		if(start<end) 
		{
			int j=partition(array,start,end);
			quickSort(array, start, j-1);
			quickSort(array, j+1, end);
		}
	}

	public static int partition(int[] array, int start, int end) 
	{
		int pivote=array[start];
		int low=start+1;
		while(low<end)
		{
			while(array[low]<pivote)
				low++;
			while(array[end]>pivote)
				end--;
			if(low<end)
			{
				int t=array[low];
				array[low]=array[end];
				array[end]=t;
			}
		}
		array[start]=array[end];
		array[end]=pivote;
		return end;
	}
}
