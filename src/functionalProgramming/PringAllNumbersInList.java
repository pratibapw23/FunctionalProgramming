package functionalProgramming;

import java.util.List;

public class PringAllNumbersInList {

	public static void main(String[] args) {
		
//		printAllNumbers(List.of(10,5,4,3,19,20));
		printEvenNumbers(List.of(10,5,4,3,19,20,11));
	}
	
//	public static void print(int n) {
//		System.out.println(n);
//	}

	private static void printAllNumbers(List<Integer> nums) {

		nums.stream()
			.forEach(System.out::println);
	}
	private static void printEvenNumbers(List<Integer> nums) {
		nums.stream()
			.filter(number -> number%2==0)
			.forEach(System.out::println);
	}

}
