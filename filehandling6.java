import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month Of Year:");
		int month=sc.nextInt();
		String season;
		switch(month)
		{
			case 3:
			case 4:
			case 5:
			season="Spring";
			break;
			case 6:
			case 7:
			case 8:
			season="Summer";
			break;
			case 9:
			case 10:
			case 11:
			season="Autum";
			break;
			case 12:
			case 1:
			case 2:
			season="Winter";
			break;
			default:
			season="Enter valid Month...";
			break;		
		}
		System.out.println("Season of month " +month+  " is " +season);
	}
}