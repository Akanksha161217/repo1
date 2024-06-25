import java.util.*;
class Test{
	public static void main(String args[]){
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		x=sc.nextInt();
		System.out.println("Enter Second number");
		y=sc.nextInt();
		try{
			System.out.println("x/y="+x/y);
		}
		catch(ArithmeticException e){
			System.out.println("Second number cannot be zero");
		}
		finally{
			System.out.println("Exception successfully Handled");
		}
	}

}