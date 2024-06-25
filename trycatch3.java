class Test{
	public static void main(String args[]){
	int n=17;
	try{
		System.out.println("Number is="+n);
		}
		catch(Exception e){
			System.out.println("Exception Handled..");
		}	
		finally{
			System.out.println("i executed always");
		}
	}
}