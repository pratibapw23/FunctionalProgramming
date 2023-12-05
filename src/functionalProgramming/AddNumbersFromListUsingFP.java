package functionalProgramming;

import java.util.List;

public class AddNumbersFromListUsingFP {

	public static void main(String[] args) {
		
		int sum=sumOfListElements(List.of(10,20,30,49,28));
		int sum2=sumOfListElementsUsingMethodRef(List.of(1,2,3,5,3,4,4));
		System.out.println(sum);
		System.out.println(sum2);

	}

	private static int sumOfListElements(List<Integer> numbers) {
		return
				numbers.stream()
					.reduce(0, (x,y) -> x+y); //using Lambda Expressions
	}
	private static int sumOfListElementsUsingMethodRef(List<Integer> numbers) {
		return
				numbers.stream()
					.reduce(0, Integer::sum); //using method references
	}

}
