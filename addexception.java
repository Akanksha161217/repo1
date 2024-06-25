import java.util.*;
class Test{
	public static void main(String args[])throws Exception{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:-");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		try{
			if(a==0|b==0){
			throw new Exception();
			}
			else
		
			System.out.println("Sum="+(a+b));
		}
		catch(Exception e){
		System.out.println("Please Enter only non-zero value!!!....");
		}
		finally{
			System.out.println("Exception Successfully Handled...");
		}
	}
}