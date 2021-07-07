package org.sample;

public class SampleProject {

	public void empName() {
		System.out.println("Employee name is xxx");

	}
	
	public void empDob() {
		System.out.println("Employee Dob is 09.08.1994");

	}
	public static void main(String[] args) {
		SampleProject s = new SampleProject();
		s.empName();
		s.empDob();
	}
}
