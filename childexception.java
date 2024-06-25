import java.util.*;
class MyException extends Exception{

	
}
class Test{
	public static void main(String args[]){
		try{
		throw new MyException();	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}