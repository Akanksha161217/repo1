import java.util.*;
class Test{
	public static void main(String args[]){
	String a="Java";
	int n=a.length();
	char[]arr=a.toCharArray();
	int start=0;
	int end=n-1;
	char temp;
	while(start<end){
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}	
		System.out.print(arr);
	}
}