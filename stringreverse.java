import java.lang.*;
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		String original="Hello world";
		StringBuilder sb=new StringBuilder(original);
		String reverse=sb.reverse().toString();
		System.out.println("Reversed:"+reverse);
	}
}