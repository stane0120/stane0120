package template;

public class ManualComputer extends Computer{
	
	@Override
	public void Click() {
		System.out.println("사람이 클릭합니다");
		System.out.println("사람이 마우스를 움직입니다");
	}
	
	@Override
	public void mouse() {
		System.out.println("사람이 마우스합니다");
	}

}
