package Docu2;

import java.util.*;

import Operators.Swap;


public class SortArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");
		int size = scan.nextInt();
		int [] unsortedArray = new int[size] ;

		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println("please enter value for index " +i);
			int index = scan.nextInt();
			if (index<0 || index>2) {
				System.out.println("please enter a value between 0 & 2");
				i--;
			} else {
				unsortedArray[i] = index;
			}
		}
		System.out.println(Arrays.toString(unsortedArray));
		
//		int [] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
//
//		SortArray(arr);

		SortArray(unsortedArray);
	}

	private static void SortArray(int[] unsortedArray) {
		
		for(int i=0;i<unsortedArray.length;i++) {
			for(int j=i+1;j<unsortedArray.length;j++) {
				if(unsortedArray[i]>unsortedArray[j]) {
					swap(i, j, unsortedArray);
				}
			}
		}
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(unsortedArray));
	}

	private static void swap(int i, int j, int[] unsortedArray) {
		int temp = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = temp;
	}
}
