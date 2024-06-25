import java.io.*;
class Test{
	public static void main(String args[])throws
	IOException{
		File file=new File("amm.txt");
		if(file.canRead()){
			System.out.println("file amm.txt can be read");
		}
		else{
			System.out.println("File amm.txt cannot be read");
		}
	}
}