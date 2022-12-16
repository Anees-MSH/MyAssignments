package orgstudent;

import orgdepartment.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("S.venba");
	}

	public void studentDept() {
		System.out.println("Dept:Playschool");
	}
	public void studentId() {
		System.out.println("Id:04");
	}
public static void main(String[] args) {
	Student obj=new Student();
	obj.studentName();
	obj.studentId();
	obj.studentDept();
	obj.deptName();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	
}
}

