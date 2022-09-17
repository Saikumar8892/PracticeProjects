import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("H:\\Sai.txt");
			myWriter.write("Welcome to simplilearn");
			myWriter.close();
			System.out.println("updated data sucessfully");
		} catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}