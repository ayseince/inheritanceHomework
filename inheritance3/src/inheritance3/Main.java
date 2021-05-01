package inheritance3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherUser engin = new TeacherUser();
		engin.userNumber=("1564");
		
		TeacherUser zeynep = new TeacherUser();
		zeynep.userNumber=("3697");
		
		StudentUser ayse=new StudentUser();
		ayse.userNumber=("8520");
		
		StudentUser yasemin=new StudentUser();
		yasemin.userNumber=("4562");
		
		
		UserManager userManager=new UserManager();
		userManager.addUser(engin);
		userManager.addUser(ayse);
		
		User [] users= {ayse, engin,yasemin,zeynep};
		userManager.addMultiple(users);

	}

}
