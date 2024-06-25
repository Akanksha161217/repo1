import java.util.*;
class Animal{
	void show(){
		System.out.println("Sound of animal:");
	}
}
class dog extends Animal{
	void show(){
	System.out.println("This Sound is dog.");
	}
}
class cat extends Animal{
	void show(){
	System.out.println("This Sound is Cat.");
	}
}
class Test{
	public static void main(String args[]){
	dog obj1=new dog();
	obj1.show();
	cat obj2=new cat();
	obj2.show();
	}
}