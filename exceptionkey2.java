class  Test{
	public static void main(String args[]){
		int arr[]={11,23,45,67};
		System.out.println(arr[2]);
		try{
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOFBoundException e){
			System.out.println("Array size is Small");
		}
	}
	
}