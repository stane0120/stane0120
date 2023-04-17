package practice;

public class practice32 {
	public static void main(String[] args) {
		practice31 studentLee = new practice31();
		studentLee.setStudentName("이상원");    // setStudentName() 메서드를 활용해 private 변수에 접근할 수 있다.
			
		System.out.println(studentLee.getStudentName());		
	}

}
