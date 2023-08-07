package abstractex;

import template.AIComputer;
import template.Computer;
import template.ManualComputer; // 추상 클래스를 가져오는 임포트 구문

public class ComputerTest {
	public static void main(String[] args) { // 메인 메서드라는 코드
		System.out.println("=== 자율 주행하는 마우스 ===");
		Computer myComputer = new AIComputer(); // AIComputer 클래스의 프린트 구문을 가져온다.
		myComputer.run();
		
		System.out.println("=== 두바퀴로 가는 자전거 ===");
		Computer hisComputer = new ManualComputer(); // ManualComputer 클래스의 프린트 구문을 가져온다
	    hisComputer.run(); // Computer의  run 템플릿 메서드를 가져온다
	}

}
