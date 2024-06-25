interface ABC{
	 final int x=10;
	final int y=20;
	public void first();
	public void second();
}

class MyClass implements ABC{
	public void first(){
	System.out.println("Frist Method Implemented");
	}
	public void second(){
	System.out.println("Second Method Implemented");
	}
}
class Test{
	public static void main(String args[]){
	MyClass obj=new MyClass();	
	
	System.out.println(obj.x);
	System.out.println(obj.y);

	obj.first();
	obj.second();
	}
}