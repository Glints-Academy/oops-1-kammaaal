package com.assesment;

public class Main {
	public static void main(String[] args) {
		
		  /* Running Person class*/
		  Person persOne = new Person("Mang Oleh", "Bekasi Galaxy");
		  
		  /* Printing Person class */
		  System.out.println(persOne);

		  /* Running & Printing Student class */
	      Student studOne = new Student("Kemal Andraza", "East Jakarta");
	      System.out.println(studOne);
	      
	      studOne.addCourseGrade("Java Basic", 90);
	      studOne.addCourseGrade("Java OOP", 75);
	      studOne.printGrades();

	      System.out.println("Average Grade is " + studOne.getAverageGrade());
	      
	      
	      /* Running Teacher class */
	      Teacher teacherOne = new Teacher("prof. Margo", "Batam City");
	      System.out.println(teacherOne);
	      
	      String[] courses = {"Java Basic", "Java OOP", "Java Basic"};
	      for (String course: courses) {
	         if (teacherOne.addCourse(course)) {
	            System.out.println(course + " added");
	         } else {
	            System.out.println(course + " cannot be added");
	         }
	      }
	      
	      for (String course: courses) {
	         if (teacherOne.removeCourse(course)) {
	            System.out.println(course + " removed");
	         } else {
	            System.out.println(course + " cannot be removed");
	         }
	      }
	      
	      // test Setter
	      persOne.setAddress("Planet Namek");
	      studOne.setAddress("Bali");
	      teacherOne.setAddress("Taman Safari Batam");
	      
	      // printing test setter result
	      System.out.println(persOne);
	      System.out.println(studOne);
	      System.out.println(teacherOne);
	      
	}
}
