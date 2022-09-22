package Docu2;

import java.util.Arrays;

public class PositiveNegative {

	public static void main(String[] args) {
		int [] arr = {1, -1, 3, 2, -7, -5, 11, 6 };

		sortArray(arr);

	}

	private static void sortArray(int[] arr) {
		int c=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				c++;
				for(int j=i;j>c;j--)
				{
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	
	
	private static void moveToLast(int i, int[] arr) {
		int temp = arr[i];
		for (int j = i; j < arr.length-1; j++) {
			arr[j] = arr[j+1];
		}
		arr[arr.length-1] = temp;
	}

}
