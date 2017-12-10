package com.javalec.ex;

public class StudentInfo {
	private Student student;

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void getStudentInfo() {
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getGradeNum());
		System.out.println(student.getClassNum());
	}

}
