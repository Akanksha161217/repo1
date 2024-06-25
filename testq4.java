import java.util.*;
interface language{
	String lang="Java";
}
class  sample implements language{
	public void show(){
		System.out.println("Programming Language : Java");
	}
}
class Test{
	public static void main(String args[]){
		sample obj=new sample();
		obj.show();
	}
}