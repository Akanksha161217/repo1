import java.util.*;
class Test{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Number:");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		System.out.print("Binary value :"+binary);
	}
}