import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Test{
	public static void main(String args[]){
		LocalDateTime currentDateTime=LocalDateTime.now();
		DateTimeFormatter z=DateTimeFormatter.ofPattern("yyyy-MM-dd  hh:mm:ss");
		String z1=currentDateTime.format(z);
		System.out.println("Current Date & Time:"+z1);
	}
}