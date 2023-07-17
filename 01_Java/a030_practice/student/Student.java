package student;

public class Student {
	public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

}
