package practice;

public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;   // 변수 선언
	
	public Student1 () {
		serialNum++;
		studentID = serialNum; // 학번은 기본값인 1000에서 1씩 증가한다.
	}
	
	public String getStudentName() {
		return studentName;         // 이름 반환
	}
	
	public void setStudentName(String name) {
		studentName = name; // 이름 반환
	}

}
