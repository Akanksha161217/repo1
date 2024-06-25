class Test{
	public static void main(String args[]){
		int i=50;
		int j=0;
		try{
			System.out.println("i/j="+(i/j));
		}
		catch(ArithmeticException e){
			System.out.println("Can't devided by zero");
		}
	}	
}