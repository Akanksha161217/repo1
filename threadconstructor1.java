class Thread1 implements Runnable{
	public void run(){
	System.out.print("Thread started Successfully...");
	}
}
class Test{
	public static void main(String args[]){
	Thread1 t1=new Thread1();
	Thread t2=new Thread(t1,"Second_Thread");
	t2.start();
	System.out.println(t2.getName());
	}
}