package a0000_practice;

public class practice {
	private String ip;   // (캡슐화 원칙으로 인해 private)
    private String user;
	
    public practice() {} // 기본 생성자
    public practice(String ip, String user) { // 매개변수 생성자
    	this.ip = ip; // this 참조변수
    	this.user = user;   	
    }
    // getter / setter 
    public String getIp() {
    	return ip;
    }
    
    public void setIp(String ip) {
    	this.ip = ip;
    }
    
    public String getUser() {
    	return user;
    }
    
    public void setUser(String user) {
    	this.user = user;
    }
	// 객체의 필드 값을 하나의 문자열 형태로 반환하는 메서드
    public String inform() {
    	return ip + "(" + user + ")";
    }
   
}
