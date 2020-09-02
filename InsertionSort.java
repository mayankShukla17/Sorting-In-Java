package Sorting_In_Java;
import java.util.Scanner;
public class InsertionSort 
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
		insertionSort(array);
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i]+" ");
	}

	public static void insertionSort(int[] array) 
	{
		for (int i = 1; i < array.length; i++) 
		{
			int element=array[i];
			int j=i-1;
			while(j>=0&&element<array[j])
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=element;
		}
	}
}
