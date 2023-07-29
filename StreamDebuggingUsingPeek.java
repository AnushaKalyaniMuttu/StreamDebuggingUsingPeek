package com.biconsumer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDebuggingUsingPeek {
//peek will sys out all the stream elements in the list will help us to debug
	public static void main (String [] args) {
		Map<String,List<String>> studentDatabse=StudentDatabase.getAllStudents().stream()
				.peek(s->System.out.println(s))
				.filter(s->s.getGradeLevel()>3)	
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		studentDatabse.entrySet().forEach(System.out::println);
	}
	
}
