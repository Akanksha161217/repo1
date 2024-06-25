import java.util.*;
class Test{
	public static void main(String args[]){
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size:");
		size=sc.nextInt();
		for(int i=size; i>=1;i--){
			for(int j=size;j>=i ;j--){
				System.out.print(j+"");
			}
			System.out.println( );
		}
		
	}
}