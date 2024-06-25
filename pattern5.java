import java.util.*;
class Test{
	public static void main(String args[]){
		int i,j;
		int alpha=64;
	
		for(i=1;i<=26;i+=2){
			for(j=1;j<=13;j++){
				if( j==1 || j+i==14 || i-j==13 || i==i+1){
					System.out.print((char)(alpha+i));
				}
				else{

					System.out.print(" ");
					
					
				}
			}
			System.out.println( );
		}
	}
}