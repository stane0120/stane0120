package practice;

public class practice29 {
	int studentID;
	String studentName;
	int grade;
	String address; // 멤버 변수
	
	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {
		practice29 studentAhn = new practice29(); // Student 클래스 생성
		studentAhn.studentName = "안미연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName()); // 출력 구문
	}
}