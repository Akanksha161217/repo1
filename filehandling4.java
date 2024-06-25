import java.util.*;
class Test{
	public static void main(String args[]){
		int year;
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		year=sc.nextInt();
		a=(year%4==0)? "Leap": "Not Leap";
		System.out.println(year+" is "+a);
	}
}