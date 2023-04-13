package practice;

public class practice30 {
	public static void main(String[] args) {
		person personKim = new person();
		personKim.name = "김뚜띠";
		personKim.weight = 85.5F;   // 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화 
		personKim.height = 180.0F;
		
		person personLee = new person("나나양", 175, 70); // 인스턴스 변수 초기화와 동시에 클래스 생성
	}

}
