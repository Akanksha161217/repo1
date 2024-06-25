import java.util.*;
class Test{
	public static void main(String args[]){
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Between o to 1000:");
		num=sc.nextInt();
		int temp=num;
		do{
			sum+=temp%10;
			temp/=10;
		}
		while(temp>0);
		System.out.println("Sum of Digit:"+sum);
	}
}