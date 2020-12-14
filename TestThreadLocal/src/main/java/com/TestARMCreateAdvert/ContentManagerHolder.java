package com.TestARMCreateAdvert;

public class ContentManagerHolder {

	ThreadLocal<Student> managerHolder = new ThreadLocal<>();
	private Student student;

	//-------------不使用ThreadLocal-----------------
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}

	//--------------使用ThreadLocal------------------
	public Student getStudent() {
		return managerHolder.get();
	}

	public void setStudent(Student student) {
		managerHolder.set(student);
	}

}
