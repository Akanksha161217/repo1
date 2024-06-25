import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for( int i=1;i<=n;i++){
			sum=sum+n;
		}
		System.out.print("Sum of " +n);
		System.out.print("Number is:"+sum);

	}

}