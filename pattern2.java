import java.util.*;
class Test{
	public static void main(String args[]){
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		for(i=1 ; i<=n ; i++){
			for(j=1 ; j<= 2 * ( n - i ) ; j++){
				System.out.print(" ");
			}
			for( j=i ; j>=1 ; j--){
				System.out.print(j+" ");
			}
			for(j=2 ; j<=i ; j++){
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}