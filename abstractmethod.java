abstract class Employee{
	abstract void show();
			
}
class Rahul extends Employee{
	void show(){
		System.out.println("Employee Name :- Sanika");
	}
}
class Akanksha{
	void show(){
		System.out.println("Employee Name:- Akanksha");
	}

}
class Test{
	public static void main(String args[]){
		Rahul emp1=new Rahul();
		emp1.show();
		Akanksha emp2=new Akanksha();
		emp2.show();
	}

}