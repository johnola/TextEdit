
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main{
public static void main(String[] args) throws IOException{
	Path fpath =
			Paths.get("C:/Development/Python/Workspace/Files/src/", "myfile.txt");
	if(Files.notExists(fpath)){
		
		
		Files.createFile(fpath);
	}
	
	
    File file = new File("myfile.txt");
    try {
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\t");
        while (sc.hasNextLine()) {
            String i = sc.nextLine();
            System.out.println(i);
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}
