import java.util.*;
class Test{
	public static void main(String args[]){
		int n;
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:-");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		}
		System.out.println(" Factorial of " + n+ " is: " + factorial);
	}
}