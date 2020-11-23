package com.student;

public class Student {

	
	String sname;
	int matmark;
	int scimark;
	int socmark;
	int total;
	double perc;

	public Student(String sname, int matmark, int scimark, int socmark,
			int total, double perc) {
	
		this.sname = sname;
		this.matmark = matmark;
		this.scimark = scimark;
		this.socmark = socmark;
		this.total = total;
		this.perc = perc;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
