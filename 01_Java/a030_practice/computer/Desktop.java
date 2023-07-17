package computer;

public class Desktop extends computer{ // computer 클래스에 포함된 추상 메서드인 display()와 typing()를 재정의하는 부분이다.

	@Override
	public void display() {
		System.out.println("Desktop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");
		
	}

	@Override
	public void turn0n() {
		
		
	}

}
