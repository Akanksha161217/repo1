import java.util.*;
class Test{
	public static void main(String args[]){
		int num;
		int first=0;
		int second=1;
		int fibo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to calculate fibonecees :");
		num=sc.nextInt();
		for(int i=0;i<num;i++){
			fibo=first+second;
			first=second;
			second=fibo;
			System.out.print( fibo+" ");
		}
	}
}