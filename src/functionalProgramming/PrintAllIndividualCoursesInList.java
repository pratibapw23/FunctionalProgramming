package functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllIndividualCoursesInList {

	public static void main(String[] args) {
		
		List<String> courses=List.of("Spring","Spring Boot", "API", "Microservices","AWS","APID");
//		individualCourses(courses);
//		printWordContainingFourCharacters(courses);
//		printLengthOfEachCharacter(courses);
//		sortStringsByItsLength(courses);
		System.out.println(lengthsOfCourses(courses));
		

	}

	private static void individualCourses(List<String> courses) {
		
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
	}
	private static void printWordContainingFourCharacters(List<String> courses) {
		courses.stream()
		.filter(course -> course.length()==4)
		.forEach(System.out::println);
	}
	private static void printLengthOfEachCharacter(List<String> courses) {
		courses.stream()
		.map(course -> course + " "+ course.length())
		.forEach(System.out::println);
	}
	private static void sortStringsByItsLength(List<String> courses) {
				courses.stream()
					.sorted(Comparator.comparing(str -> (str.length())))
					.forEach(System.out::println);
	}
	private static List<Integer> lengthsOfCourses(List<String> courses){
		return
				courses.stream()
					.map(course -> course.length())
					.collect(Collectors.toList());
	}

}
