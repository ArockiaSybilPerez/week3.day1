package org.student;

import org.department.Department;

//     Package   :org.student
//     Class        :Student
//     Methods   :studentName(),studentDept(),studentId()

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name is AROCKIA SYBIL PEREZ");	
	}
	
	public void studentDept() {
		System.out.println("Student Dept is ETCE - A");	
	}
	
	public void studentId() {
		System.out.println("Student Id is 11ETCE309");	
	}

	//Description:
	//create above 3 class and call all your class methods into the Student using multilevel inheritance.	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName();
		
		Student obj1 = new Student();
		obj1.studentDept();
		
		Student obj2 = new Student();
		obj2.studentId();
		
		Student obj4 = new Student();
		obj4.deptName();
		
		Student obj5 = new Student();
		obj5.collegeName();
		
		Student obj6 = new Student();
		obj5.collegeCode();
		
		Student obj7 = new Student();
		obj7.collegeRank();
				
}
}