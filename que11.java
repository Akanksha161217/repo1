import java.util.*;
class Test{
	public static void main(String args[]){
		char a='z';
		String str=Character.toString(a);
		System.out.println("String:"+str);

		String str1="Hello";
		char b=String.toChar(str1);
		System.out.println("char="+b);
	}
}