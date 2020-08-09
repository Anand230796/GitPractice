package org.colg;

public class Student extends Hostel {
	public void studentName() {
		System.out.println("the name is Anand");
	}

	public void studentDept() {
		System.out.println("the dept is mech");
	}

	public void studentID() {
		System.out.println("the id is 66553");
	}

	public static void main(String[] args) {
		Student s = new Student();
		Hostel h = new Hostel();
		dept d = new dept();
		College c = new College();
		s.studentName();
		h.HostelName();
		d.deptName();
		c.collegeCode();
	}
}
