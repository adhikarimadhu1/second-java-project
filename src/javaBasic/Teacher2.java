package javaBasic;

public class Teacher2 extends College2 {
	
	String teacherName = "buddhiram";
	public void motivation () {
		System.out.println("the teacher is responsibility for motivating the student");
		
	}
public static void main(String[]args){
	
	Teacher2 teacher = new Teacher2();
	System.out.println(teacher.teacherName);
	System.out.println(collegeName);
	System.out.println(teacher.numOfStaff);
	System.out.println(teacher.numOfStudent);
	teacher.motivation();
	teacher.teach();
	
	
}
}
