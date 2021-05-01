package inheritance3;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.userNumber+ " "+ "eklendi.");
	}
	
		public void addMultiple(User [] users) {
			for(User user:users) {
			
				addUser(user);
			
		}}
		
		
	}


