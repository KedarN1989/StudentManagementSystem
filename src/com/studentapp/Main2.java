package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	private static List<Student> listOfStudents;

	public static void main(String[] args) {

		System.out.println("********* Student Management System *********");
		System.out.println("********* Welcome *********");
		listOfStudents = new ArrayList<Student>();

		Student s1;
		s1 = new Student("Kedar", 30, "S-1");
		s1.enrollCourse("Java");
		s1.enrollCourse("DSA");
		s1.enrollCourse("DevOps");

		Student s2 = new Student("Uday", 28, "S-2");
		s2.enrollCourse("Java");

		Student s3 = new Student("Siddhi", 24, "S-3");
		s3.enrollCourse("DevOps");

		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);

		Student result = findStudentById("S-2");
		System.out.println("Result: "+ result);
		
		sortByName();
	}

	private static void sortByName() {
		Comparator<Student> studentNameComparator = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(listOfStudents, studentNameComparator);
		System.out.println(listOfStudents);
	}

	public static Student findStudentById(String studentId) {
		Student result = null;
		
		try {
			result = listOfStudents.stream().filter(student -> student.getStudentId().equalsIgnoreCase(studentId))
					.findFirst().orElseThrow(() -> new RuntimeException("No data found"));
		} catch(RuntimeException e) {
			System.err.println("Student with student id " + studentId + " is not found!!!");
		}
		
		return result;
	}

}
