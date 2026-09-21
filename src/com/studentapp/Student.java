package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;

	public Student(String name, int age, String studentId) {
		super();
		if (validateAge(age) && validateName(name) && validateStudentId(studentId)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
			courses = new ArrayList<String>();
		}
	}

	private boolean validateStudentId(String studentId) {
		// pattern is S-1234
		String studentRegex = "^S-[0-9]+$"; // Or "^S-\\d+$"
		Pattern studentIdPattern = Pattern.compile(studentRegex);
		Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
		if (studentIdMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid Student Pattern!!! Valid pattern is S-<any numbers>");
			return false;
		}

	}

	public void enrollCourse(String course) {
		if (validateCourseName(course)) {
			if (!courses.contains(course)) {
				courses.add(course);
				System.out.println("Student is enrolled to " + course + " successfully");			
			} else {
				System.err.println("Student is already enrolled to the course " + course);
			}
		}
	}

	public void printStudentInfo() {
		System.out.println("========== Student Information ==========");
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Courses: " + courses);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}

	// Validation methods
	public boolean validateAge(int age) {
		if (age >= 19 && age <= 35) {
			return true;
		} else {
			System.err.println("Invalid age!!! Student age needs to be between 19 and 35 years...");
			return false;
		}
	}

	public boolean validateName(String name) {
		// kedar KEDAR Kedar keDAR
		String nameRegex = "^[a-zA-z\\s]+$";
		Pattern namepattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namepattern.matcher(name);
		if (nameMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid name!!! Name should have alphabates and spaces only...");
			return false;
		}
	}
	
	public boolean validateCourseName(String course) {
		if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DSA") || course.equalsIgnoreCase("DevOps")) {
			return true;
		} else {
			System.err.println("Invalid course name!!! Valid courses are [Java, DSA, DevOps] ...");
			return false;
		}
	}

	public String getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
