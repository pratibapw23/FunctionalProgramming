package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintOnlyOddNumbersInList {

	public static void main(String[] args) {
		
//		int arr[]=printOddNumbers(List.of(20,1,11,13,5,14,12,20));
//		System.out.println(Arrays.toString(arr));
		
		List<Integer> arr=returnListOfOddNumbers(List.of(20,1,11,13,5,14,12,20));
		System.out.println(arr);

	}

	private static int[] printOddNumbers(List<Integer> numbers) {
		
		return 
				numbers.stream()
				.filter(number -> number%2!=0).mapToInt(number -> number).toArray();
	}
	private static List<Integer> returnListOfOddNumbers(List<Integer> numbers){
		return
				numbers.stream()
		.filter(number -> number%2!=0).toList();

	}

}
