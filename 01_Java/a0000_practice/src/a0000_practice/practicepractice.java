package a0000_practice;

public class practicepractice {
	private String ip;  
    private String user;
	
    public practicepractice() {} 
    public practicepractice(String ip, String user) { 
    	this.ip = ip; 
    	this.user = user;   	
    }

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
	
    public String inform() {
    	return ip + "(" + user + ")";
    }
   
}
