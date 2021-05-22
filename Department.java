package org.department;

import org.College;


public class Department extends College{
public void deptName() {
	System.out.println("The Department name is IT");
}
	public static void main(String[] args) {
		Department details = new Department();
		details.deptName();
		
		details.collegeName();
		details.collegeCode();
			details.collegeRank();
		}

}
