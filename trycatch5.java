import java.util.*;
class Test{
	public static void main(String args[]){
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		age=sc.nextInt();
		try{
			if(age>=18){
				System.out.println("Eligible to vote..");
		}
	}
	catch(ArithmeticException e){
		System.out.println("Not Eligible to vote");
		}
		finally{
				System.out.println("Welcome To Vote..!!");
		}
	}
}