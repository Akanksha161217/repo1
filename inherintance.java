class Animal{
	void show(){
		System.out.println("I am an Animal");
	}
}

class Tiger extends Animal{

}
class Test{
	public static void main(String args[]){
		Tiger obj=new Tiger();
		obj.show();
	}
}

	