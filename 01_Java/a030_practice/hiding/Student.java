package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;

	public String getStudentName( ) { // private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드
		return studentName;
	}
	
	public void setStudentName(String studentName) { // private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드
		this.studentName = studentName;
	}
}
