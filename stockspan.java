import java.util.*;
class Test
{
	public static void main(String args[])
	{
		int prices[]={70,60,50,100,80,90};
		int n=prices.length;
		int span=1;
		System.out.println(span+" ");
		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(prices[i]>=prices[j])
				span++;
				else
				break;
			}
			System.out.println(span+" ");
			span=1;
		}
	}
}
		