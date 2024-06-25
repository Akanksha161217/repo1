class Test
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		int rev;
		int start=0,end=1;
		while(start<end)
		{
			rev=arr[end];
			arr[end]=arr[start];
			arr[start]=rev;
			start++;
			end--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}