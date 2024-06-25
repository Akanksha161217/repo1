import java.util.*;
class Test{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter INterger value to convert into Byte, Character,Float");
		num=sc.nextInt();
		byte bt=(byte)num;
		System.out.println("Byte Value :" +bt);

		char cr=(char)num;
		System.out.println("Character Value: "+cr);

		float ft=(float)num;
		System.out.println("Float Value: "+ft);
	}
}