import java.util.*;
class Test{
	public static void main(String args[]){
		int arr[]={'H' ,'E' , 'L' , 'L' , 'O'};
		int i,j;
		for(i=0;i< arr.length;i++){
			for(j=0;j<=i;j++){
				System.out.print(arr[j]);
			}
			System.out.println( );
		}
	}
}