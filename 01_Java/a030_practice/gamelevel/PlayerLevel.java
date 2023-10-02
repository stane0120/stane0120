package gamelevel;

public abstract class PlayerLevel { // 각 레벨에서 수행할 공통 기능을 선언하는 추상 클래스
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i <count; i++) {
			jump();
		}
		turn();
	}

}
