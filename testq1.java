import java.util.*;
class Emp{
	void display(){
		System.out.println("Employee Salary=40000");
	}
}
class Bonus extends Emp{
	void show(){
		System.out.println("Bonus=10000");
	}
}
class Test{
	public static void main(String args[]){
		Bonus obj=new Bonus();
		obj.display();
		obj.show();
	}
}