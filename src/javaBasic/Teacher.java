package javaBasic;

public class Teacher extends College {
	// the teacher class is inheriting the properties and method from its parent
	// class .
	// inheriting is the way of acessing all the common
	// properties and methods from the parent class and defining
	// only unique properities and methods in the child class.
	// the extends keyword is used to inherit the parent class and properties and
	// method
	String teacherName = "nur";

	public void motivate() {

		System.out.println("the teacher is responsibile for motavating the student");
	}

	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		System.out.println(teacher.teacherName);
		teacher.motivate();
		System.out.println(collegeName);
		System.out.println(teacher.numOFStudent);
		teacher.teach();

	}
}
