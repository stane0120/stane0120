package constructor;

public class Person {
	String name;
	float height;
	float weight; // 변수
	
	public Person() {} // 디폴트 생성자
	
	public Person(String pname) { // 이름을 매개변수로 입력받는 생성자
		name = pname;
	}

	public Person(String pname, float pheight, float pweight) {
		super();
		this.name = pname;
		this.height = pheight;
		this.weight = pweight; // 이름, 키, 몸무게를 매개변수로 입력 받는 생성자
	}
	
	
}
