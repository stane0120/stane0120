package object;

public class EqualsTest{
public static void main(String[] args) {
	Student studentLee = new Student(100, "이상원");
	Student studentLee2 = studentLee;
	Student studentSang = new Student(100, "이상원");
	
	if(studentLee == studentLee2)
		System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
	else
		System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
	
	if(studentLee.equals(studentLee2))
		System.out.println("studentLee와 studentLee2는 동일합니다");
	else
		System.out.println("studentLee와 studentLee2는 동일하지 않습니다");
	
	if(studentLee == studentSang)
		System.out.println("studentLee와 studentSang의 주소는 같습니다.");
	else
		System.out.println("studentLEe와 studentSang의 주소는 다릅니다.");
	
	if(studentLee.equals(studentSang))
		System.out.println("studentLee와 studentSang는 동일합니다");
	else
		System.out.println("studentLee와 studentSang는 동일하지 않습니다");
		
}

}
