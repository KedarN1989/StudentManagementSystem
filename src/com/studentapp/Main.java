package com.studentapp;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("********* Student Management System *********");
		System.out.println("********* Welcome *********");
		
		Student s1;
		s1 = new Student("Kedar", 30, "S-1");
		s1.enrollCourse("Java");
		// s1.enrollCourse("Java");
		s1.enrollCourse("DSA");
		s1.enrollCourse("DevOps");
		// s1.enrollCourse("C#");
		// System.out.println(s1);
		s1.printStudentInfo();
		
		Student s2 = new Student("Uday", 28, "S-2");
		s2.enrollCourse("Java");
		s2.printStudentInfo();
		
		Student s3 = new Student("Siddhi", 24, "S-3");
		s3.enrollCourse("DevOps");
		s3.printStudentInfo();
	}

}
