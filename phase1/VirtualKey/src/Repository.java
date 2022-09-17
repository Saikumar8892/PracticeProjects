import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Repository {
public static void main(String[] args) {
	
	 File folder = new File("D:\\Saik.txt");
     folder.mkdirs(); 
     try (Scanner sc = new Scanner(System.in)) {
		while(true){
			 System.out.println("\n<<<<<<<<<<<<<<<<Welcome to virtual key for your repository application>>>>>>>>>>>>>>>> ");
		     System.out.println("        ........... This  application was devoloped by saikumar..........\n");
		     System.out.println("1. Display the files in ascending order");
		     System.out.println("2. Some basic operations ");
		     System.out.println("3. End Program");
		     System.out.println("Enter your choice:-");
		     int choice = sc.nextInt();
		     switch(choice)
		     {
		         case 1:

		             File arr[] = folder.listFiles();
		             Arrays.sort(arr);

		             for(int i=0;i<arr.length;i++)
		                 System.out.println(arr[i]);
		                 break;
		         case 2:
		             Boolean temp = true;
		             while(temp) {
		                 System.out.println("Option 1 :- To Add a file in the existing Directory");
		                 System.out.println("Option 2 :- To Delete a file from the existing Directory. ");
		                 System.out.println("Option 3 :- To Search a user specified file from the Directory");
		                 System.out.println("Option 4 :- Back to the previous menu");
		                 System.out.println("Option 5 :- Terminate Program");


		                 int choice2 = sc.nextInt();
		                 switch (choice2) {
		                 case 1:
		                	 System.out.println("Enter a file name");
		                     String name = sc.next();
		                     if(new File(folder,name).exists()){
		                         System.out.println("file already exist");
		                     }else {
		                         File folder1 = new File(folder, name);
		                         folder1.mkdir();
		                         if (new File(folder, name).exists()) {
		                             System.out.println("file added successfully");
		                         }
		                     }

		                     break;
		                 case 2:
		                     System.out.println("Enter a file name");
		                     String name1 = sc.next();
		                     boolean folder2 = new File(folder, name1).exists();
		                     System.out.println(folder2);
		                     if (folder2 == true) {
		                         File folder3 = new File(folder, name1);
		                         folder3.delete();
		                         System.out.println("File successfully deleted");
		                     } else {
		                         System.out.println("file does not exist");
		                     }
		                     /*folder2.delete();*/
		                     break;
		                 case 3:
		                     System.out.println("Enter a keyword to search");
		                     String search = sc.next();

		                     File arr1[] = folder.listFiles();
		                     for(int a=0;a<arr1.length;a++){
		                         if(arr1[a].getName().startsWith(search)){
		                             System.out.println(arr1[a]);
		                         }else{
		                             System.out.println("No file found");
		                         }
		                     }
		                     break;
		                 case 4:

		                     temp = false;
		                     break;

		                 case 5:

		                     System.out.println("*********Program End Successfully***********");
		                     System.exit(0);
		                 default:
		                     System.out.println("Input correct value and retry");

		                  }
		              }
		             break;

		         case 3:
		             System.out.println("*********Program End Successfully***********");
		             System.exit(0);

		         default:
		             System.out.println("Input correct value and retry");
		             break;

		        }
		     }
	}
     }
}
