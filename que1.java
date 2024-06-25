import java.util.*;
class Test{
	public static void main(String args[]){
	String regex="[aeiouAEIOU]";
	String a="WELCOME";
	a=a.replaceAll(regex," ");
	System.out.println(a);
	}
}