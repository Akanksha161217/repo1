class Addition{
	void sum(int x,int y){
		int sum=x+y;
		System.out.println("sum="+sum);
	}
	void sum(int x,int y,int z){
		int sum=x+y+z;
		System.out.println("sum="+sum);
	}
	void sum(int x,double y){
		double sum=x+y;
		System.out.println("sum="+sum);
	}
	void sum(double x,int y){
		double sum=x+y;
		System.out.println("sum="+sum);
	}

}
class Test{
	public static void main(String args[]){
		Addition obj=new Addition();
		obj.sum(5,7);
		
		obj.sum(5,7,6);
		obj.sum(6,6.76);
		obj.sum(6,6.7);


	}
}