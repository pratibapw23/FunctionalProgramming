package functionalProgramming;

import java.util.List;

public class PringAllNumbersInList {

	public static void main(String[] args) {
		
//		printAllNumbers(List.of(10,5,4,3,19,20));
//		printEvenNumbers(List.of(10,5,4,3,19,20,11));
//		printNumbersGreaterThanK(List.of(10,5,4,3,19,20,11),10);
//		printSquaresOfEachNumber(List.of(10,5,4,3,19,20,11));
		printSquaresOfEventNumbers(List.of(10,5,4,3,19,20,11));
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
	private static void printNumbersGreaterThanK(List<Integer> nums, int k) {
		nums.stream()	
			.filter(number -> number>=k)
			.forEach(System.out::println);
	}
	private static void printSquaresOfEachNumber(List<Integer> nums) {
		nums.stream()
		.map(num -> num*num)
		.forEach(System.out::println);
	}
	private static void printSquaresOfEventNumbers(List<Integer> nums) {
		nums.stream()
		.filter(num -> num%2==0)
		.map(num -> num*num)
		.forEach(System.out::println);
	}

}
