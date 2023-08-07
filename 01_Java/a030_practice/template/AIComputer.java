package template;

public class AIComputer extends Computer{
	
	@Override
	public void Click () {
		System.out.println("자율 클릭합니다");
		System.out.println("알아서 클릭합니다");
	}
	
	@Override
	public void mouse() {
		System.out.println("스스로 마우스합니다");
	}
	

}
