class Test{
	public static void main(String args[]){
		int i=100;
		int j=0;
		try{
			System.out.println((i/j));
		}
		catch(Exception e){
			System.out.println("Exception Handled");
		}
		finally{
			System.out.println("i executed always");
		}
	}
}