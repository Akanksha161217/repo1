class Thread1 extends Thread{
	public void run(){
		Thread2 t2=new Thread2();
		t2.start();
		try{
			t2.sleep(2000);
		}
		catch(Exception e){}
		System.out.println("Sencond Thread State:" +t2.getState());
	}

}

class Thread2 extends Thread{
	public void run(){
		Thread3 t3=new Thread3();
		t3.start();
		try{
			t3.sleep(3000);
		}
		catch(Exception e){}
		System.out.println("Third Thread State :"+t3.getState());
	}
}
class Thread3 extends Thread{
	}

class Test{
	public static void main(String args[]){
		Thread t1=new Thread1();
		t1.start();
		try{
			t1.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("First Thread State:"+t1.getState());
	}
}