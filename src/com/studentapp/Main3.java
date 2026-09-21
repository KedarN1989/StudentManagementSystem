package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	private static List<Student> listOfStudents;

	public static void main(String[] args) {

		System.out.println("********* Student Management System *********");
		System.out.println("********* Welcome *********");
		listOfStudents = new ArrayList<Student>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name...");
		String name = scanner.next();
		System.out.println("You have entered name as "+ name);
		
		System.out.println("Enter Student Age...");
		int age = scanner.nextInt();
		System.out.println("You have entered age as "+ age);
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
