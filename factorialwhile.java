import java.util.*;
class Test{
	public static void main(String args[]){
		int n,i=1;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		n=sc.nextInt();
		while(i<=n){
		 fact=fact*i;
		i++;
		}
		
		System.out.println("Factorial of " + n + "Is:-" +fact);
	}
}