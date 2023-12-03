package functionalProgramming;

import java.util.List;

public class PrintAllIndividualCoursesInList {

	public static void main(String[] args) {
		
		List<String> courses=List.of("Spring","Spring Boot", "API", "Microservices","AWS");
		individualCourses(courses);

	}

	private static void individualCourses(List<String> courses) {
		
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
	}

}
