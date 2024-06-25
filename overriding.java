class Animal{
	void show(){
		System.out.println("I am an Animal");
	}
}

class Tiger extends Animal{
	void show(){
		System.out.println("My Name IS Tiger");
	}
}
class Elephant extends Animal{
	void show(){
		System.out.println("My Name IS Elephant");
	}
}

class Test{
	public static void main(String args[]){
		Tiger obj=new Tiger();
		obj.show();
		Elephant obj1=new Elephant();
		obj1.show();

	}
}

	