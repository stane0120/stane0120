package template;

public abstract class Computer {
	public abstract void Click();
	public abstract void mouse();
	
	public void startmouse() {
		System.out.println("마우스를 누릅니다");
	}
	
    public void turnclick() {
    	System.out.println("마우스를 뗍니다");
    }
    
    final public void run() {
    	startmouse();
    	Click();
    	mouse();
    	turnclick();
    } // 템플릿 메서드

}
