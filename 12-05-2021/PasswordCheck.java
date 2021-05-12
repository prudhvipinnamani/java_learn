import java.util.Scanner;

 class Login extends PasswordCheck {
	 
	 public String passwordCheck(String answer, String password) {
		 
		 if(answer==password)
			 return "correct password";
		 else
			 return "password you entered is wrong";
	 }
}

public class PasswordCheck {
	
	String password;
	
    public void createAccount() {
    	Scanner s=new Scanner(System.in);
		System.out.print("Enter your Password: ");
		String password= s.nextLine();
    }
    
	public static void main(String[] args) {
		
		Login myobj = new Login();
		myobj.createAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("your account is ready, if you want to relogin type 'Yes': ");
		String relogin= sc.nextLine();
		
		if(relogin.equals("Yes")) {
			
			
			do {
				
				System.out.println("Enter your Password for Reloging or if you forgot close this page: ");
			}while(myobj.passwordCheck(sc.nextLine(),myobj.password)!="correct password");
			
		}
		else
			System.out.print("You can close this page");
		}

}
