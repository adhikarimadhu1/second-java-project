package javaBasic;

public class Teacher1 extends College1 {
	String teacherName = "ram";

	public void motivate() {
		System.out.println("the teacher is responsible for motivated to student");

	}

	public static void main(String[] args) {
		Teacher1 teacher = new Teacher1();
		System.out.println(teacher.teacherName);
		teacher.motivate();

		System.out.println(college1Name);
		System.out.println(teacher.numOfStudents);
		teacher.teach();

	}

}
