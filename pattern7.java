import java.util.*;
class Test{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		n=sc.nextInt();
		for(int row=n; row<n; row--){
			for(int col=n; col>=row-1; col--){
				System.out.print( row+ " ");
			}
			System.out.println( );
		}
	}
}