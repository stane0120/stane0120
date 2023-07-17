package computer;

public abstract class computer {
	public abstract void display();
	public abstract void typing();
	public abstract void turn0n(); {
	System.out.println("전원을 켭니다.");
}
    public void turn0ff() {
    	System.out.println("전원을 끕니다.");
    }
}

// 추상 클래스를 상속받은 클래스는 추상 클래스가 가진 메서드를 상속받는다.
// 상속받은 클래스는 추상 메서드를 포함한다.