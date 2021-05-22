package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name of the studentName is Priya Ganesan");
	}
	public void studentDept() {
		System.out.println("The studentDept InfoTech");
		}
	public void studentId() {
		System.out.println("The studentId is 12");
	}
		public static void main(String[] args) {
			Student details = new Student();
			details.studentName();
				details.studentDept();
					details.studentId();
					
					details.deptName();
					
					details.collegeName();
					details.collegeCode();
						details.collegeRank();
		}

	}