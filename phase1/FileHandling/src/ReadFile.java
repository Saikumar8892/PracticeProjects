


import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("H:\\Sai.txt");
			Scanner myReader = new Scanner(myObj);
// we can use while loop we dont know how much data is there
			while(myReader.hasNext()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(Exception e){
			e.printStackTrace();	
		}
	}
}