package a01;

public class Service {

	public user signUp(String userId, String userPw, String userPwConfirm,
			           String userName) {
		
		user user = null;
		
		if(userPw.equals(userPwConfirm) ) {
			
			user = new user(userId, userPw, userName);
		}
		
		
		return user;
		
		
	}
	
	public void login(String userId, String userPw, user signUpUser) {



boolean idCheck = userId.equals( signUpUser.getuserId());


boolean pwCheck = userPw.equals( signUpUser.getUserPw());



if(idCheck && pwCheck) {

view.loginUser = signUpUser;		
}
}



public boolean userUpdate(String userName, char userGender, String userPw) {


if( !view.loginUser.getUserPw().equals(userPw) ) {

return false;
} 


view.loginUser.setUserName(userName);

return true;
}
}
