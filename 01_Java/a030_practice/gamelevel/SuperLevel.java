package gamelevel;

public class SuperLevel extends PlayerLevel {  // 고급자 레벨 클래스
	@Override
	public void run() {
		System.out.println("천천히 달립니다");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 높이 접프합니다");
	}
	
	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
	}

}
