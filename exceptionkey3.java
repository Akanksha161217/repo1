class Test{
	public static void main(String args[]){
		String z=null;
		try{
		System.out.println(z.length());
		}
		catch(NullPointerException e){
			System.out.println("String is Empty");
		}
	}
}