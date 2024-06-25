class Student{
	private int rollno=101;
	private String name="Akanksha Jadhav";
	void getRollno(){
		System.out.println(this.rollno);
	}
	void getName(){
		System.out.println(this.name);
	}
	void setRollno(){
		this.rollno=117;
	}
	void setName(){
		this.name="Sanika Hajare";
	}

}
class Test{
	public static void main(String args[]){
	Student obj=new Student();
	obj.getRollno();
	obj.setRollno();
	obj.getName();
	obj.setName();
	obj.getRollno();
	obj.setRollno();
	
	obj.getName();
	obj.setName();
	}
}