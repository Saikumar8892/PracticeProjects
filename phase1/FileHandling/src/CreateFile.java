import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("H:\\Sai.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exixts");
			}
		}catch(Exception e){
			System.out.println("Error occured");
			e.printStackTrace();
	  }
	}
}
