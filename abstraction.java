abstract class Display{
	void show(){
	System.out.println("This Method Belong to Abstract Class");

	}
}
class ChildDisplay extends Display{

}
class Test{
	public static void main(String args[]){
		ChildDisplay  obj=new ChildDisplay();
		obj.show();
	}

}