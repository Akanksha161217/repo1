import java.util.*;
class Test{
	public static void main(String args[]){
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		a=sc.next();
		String regex="[aeiouAEIOU]";
		a=a.replaceAll(regex," ");
		System.out.println(a);
	}
}