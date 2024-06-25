class Sample{
	void display(){
		System.out.println("This Is Encapsulated Methode...");
	}
	 void getDisplay(){
		display();
	}
}
class Test{
	public static void main(String args[]){
		Sample obj=new Sample();
		obj.getDisplay();
	}
}