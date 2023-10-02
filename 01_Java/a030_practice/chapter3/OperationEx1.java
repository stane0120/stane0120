package chapter3;

public class OperationEx1 {
	public static void main(String[] args) { // 메인 메서드
		int myAge = 23;   // 변수에 값 대입
		int teacherAge = 38;
		
		boolean value = (myAge > 25); // myAge가 25보다 큰가?
		System.out.println(value);
		
		System.out.println(myAge <= 25); // myAge가 25보다 작거나 같은가?
//		System.out.println(myAge = teacherAge); // 
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F'; // myAge가 teacherAge보다 크면 T, 작거나 같으면 F 출력
		
		System.out.println(ch);
	}

}
