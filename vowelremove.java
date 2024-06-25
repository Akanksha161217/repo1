import java.util.*;
class Test
{
	public static void main(String args[])
	{
		String regex="[aeiouAEIOU]";
		String z="Java Langusge is easy to learn";
		String z1=" ";
		z1=z.replaceAll(regex,"");		
		
	System.out.print(z1);
	}
}