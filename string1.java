import java.lang.*;
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		String z="W E L C O M E ";
		int n=z.length();
		char[]arr=z.toCharArray();
		int start=0;
		int end=n-1;
		char temp;
		while(start<end)
		{
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
		System.out.print(arr);
	}
}