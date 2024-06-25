class Thread1 extends Thread{
	public void run(){
		System.out.println("First_Thread");
	}
}
class Test{
	public static void main(String args[]) throws Exception{
		Thread t1=new Thread();
		System.out.println("Thread State:"+t1.getState());
		t1.start();
		System.out.println("Thread State:"+t1.getState());
		t1.sleep(4000);
		System.out.println("Thread State:"+t1.getState());
		
	}
}