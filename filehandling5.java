import java.time.YearMonth;
import java.util.*;
class Test{
	public static void main(String args[]){
		int year,month;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		year=sc.nextInt();
		System.out.println("Enter Month:");
		month=sc.nextInt();
		YearMonth ym=YearMonth.of(year,month);
		int days=ym.lengthOfMonth();
		System.out.println("Number of days in"+ym.getMonth()+" "+year+":"+days);
	}
}