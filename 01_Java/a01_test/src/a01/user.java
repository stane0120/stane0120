package a01;

public class user {
	
	private String userId;
	private String userPw;
	private String userName;
	

	public user() {} 

	public user(String userId, String userPw, 
			      String userName) {
		
	   this.userId = userId;	
	   this.userPw = userPw;	
	   this.userName = userName;	
	}
	

	public String toString() {
		return String.format("%s / %s / %s", userId, userPw, userName);
		
	}
	
	public String getuserId() {
		return userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public String getUserName() {
		return userName;		
	}
	

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
    public void setUserName(String userName) {
    	this.userName = userName;
    }
    
	
	
	
	
}