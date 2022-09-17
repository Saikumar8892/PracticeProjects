

import java.io.*;

public class AppendFile {

	public static void main(String[] args) {
		File myObj = new File("H:\\Sai.txt");
		if(myObj.exists()) {
			System.out.println(myObj.getName());
			System.out.println(myObj.getAbsolutePath());
			System.out.println(myObj.length());
			System.out.println(myObj.canRead());
			System.out.println(myObj.canWrite());
	    }else {
	    	System.out.println("File not exists");
	    }
    }
}