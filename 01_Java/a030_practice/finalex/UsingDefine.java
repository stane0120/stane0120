package finalex;

public class UsingDefine {
	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);  // static 으로 선언했기 때문에 인스턴스를 생성하지 않고 클래스 이름으로 참조할 수 있다.
		System.out.println("최솟값은 " + Define.MIN + "입니다."); // Define.을 출력
		System.out.println("최댓값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG+ "입니다.");
	}

}
