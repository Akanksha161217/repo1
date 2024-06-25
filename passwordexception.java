import java.util.Scanner;
class Test{
	public static void main(String args[]){
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id : ");
		id=sc.nextInt();
		System.out.println("Enter Password:");
		String password=sc.next();
		try{
			if(password.length()>7)
			throw new Exception();
			else
			System.out.println("You are logged in...");
		}
		catch(Exception e){
			System.out.println("Password Length Should Not Exceed 7!!");
		}
	}

}