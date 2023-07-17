package student;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1(); // 메인 메서드로 Student1을 받아온다
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);  // 학번과 이름을 출력하는 창
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손승현");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID); // 학번과 이름을 출력하는 창
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김지형");
		System.out.println(Student1.serialNum);
		System.out.println(studentKim.studentName + " 학번: " + studentKim.studentID); // 학번과 이름을 출력하는 창
	}

}
