package org.Student;
import org.Department.Department;

public class Student extends Department{
	public void studentName() {
		String Sname = "Shyamala";
		System.out.println("Student name is :"+Sname);
	}
	public void studentDept() {
		String Sdept = "CSE";
		System.out.println("Student Dept is :"+Sdept);
	}
	public void studentId() {
		String Sid = "308009";
		System.out.println("Student ID is :"+Sid);
	}
	
	public static void main(String args[]) {
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.deptName();
		stud.collegeName();
		stud.collegeRank();
		stud.collegeCode();
		
		
	}

}
