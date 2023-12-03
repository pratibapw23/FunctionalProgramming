package functionalProgramming;

import java.util.List;

public class PrintAllIndividualCoursesInList {

	public static void main(String[] args) {
		
		List<String> courses=List.of("Spring","Spring Boot", "API", "Microservices","AWS","APID");
//		individualCourses(courses);
//		printWordContainingFourCharacters(courses);
		printLengthOfEachCharacter(courses);

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

}
