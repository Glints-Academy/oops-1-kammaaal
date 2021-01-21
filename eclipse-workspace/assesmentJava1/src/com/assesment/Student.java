package com.assesment;

public class Student extends Person{
	// declaring variable for student class
	int numCourses; 
	String[] courses;
	int[] grades;
	public static final int MAX_COURSES = 5;
	
	//making student constructor
	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}
	
	// printing student data
	public String toString() {
		return "Student: " + super.toString();
	}
	
	// make addCourseGrade method
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	// make printGrade method
	public void printGrades() {
		System.out.println(this);
		for (int i = 0; i < numCourses; i++) {
			System.out.println(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}
	
	// count grade average from student
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
	}
}
