import java.io.*;
class Test{
	public static void main(String args[])throws 
	IOException{
		File file=new File("amm.txt");
		String filePath=file.getAbsolutePath();
		System.out.println("File path :"+filePath);
		long fileSize=file.length();
		System.out.println("File Length:"+fileSize+"byte ");
	}
}