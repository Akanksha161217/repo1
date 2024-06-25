import java.                                                                                                                                                                                         io.*;
class Test{
	public static void main(String args[])throws
		IOException{
		FileWriter write=new FileWriter("amm.txt");
		String z="File Create Successfully...";
		write.write(z);
		write.close();
		System.out.println("Successfull..!!");
	}
}