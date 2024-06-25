import java.util.*;
interface Stud{
	String name="Avinash";
	int rollno=68;
	}
                                        
class ABC implements Stud{
	public void name(){
		System.out.println("Name=Avinash");
	}
	public void rollno(){
		System.out.println("Roll_no=68");
	}
}                                                                     
class Test{
	public static void main(String args[]){
		ABC obj=new ABC();
		System.out.println(obj.name());
		System.out.println(obj.rollno());
		obj.name();
		obj.rollno();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            