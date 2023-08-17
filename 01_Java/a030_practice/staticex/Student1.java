package staticex;

public class Student1 {
	public static int serialNum = 1000; // Student1 속성
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum ++;  // 학생이 생성될 때 마다 1씩 증가
		studentID = serialNum;  // 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;   // StudentName의 getter / setter 메서드
	}

}
