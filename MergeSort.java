package Sorting_In_Java;
import java.util.Scanner;
public class MergeSort 
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
		mergeSort(array,0,array.length-1);
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i]+" ");
	}

	public static void mergeSort(int[] array, int start, int end) 
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSort(array, start, mid);
			mergeSort(array, mid+1, end);
			merge(array,start,mid,end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end) 
	{
		int array1 []=new int[end-start+1];
		int i=start,k=0;
		int j=mid+1;
		while(i<=mid && j<=end) 
		{
			if(array[i]<array[j])
				array1[k++]=array[i++];
			else
				array1[k++]=array[j++];
		}
		while(i<=mid)
			array1[k++]=array[i++];
		while(j<=end)
			array1[k++]=array[j++];
		for (k = 0; k < array1.length; k++) 
			array[start+k]=array1[k];
	}
}
