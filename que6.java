import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal Number:");
		int decimal=sc.nextInt();
		String binary=Integer.toBinaryString(decimal);
		System.out.print(binary);
	}
}