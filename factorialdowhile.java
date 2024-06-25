import java.util.*;
class Test{
	public static void main(String args[]){
		int num,i=1;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		num=sc.nextInt();
		do{
			fact=fact*i;
			i++;
		}
		while(i<=num);
		System.out.println("Factorial Of " +num+ "Is:-" +fact);
	}
}