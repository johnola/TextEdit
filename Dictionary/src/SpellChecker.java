
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;


public class SpellChecker {
	
	public static void main(String[] args) throws IOException{
		
				String filename= (System.getProperty("user.dir") + File.separatorChar + "\\src\\" +"checkspelingsl.txt"); 
	
		
		
	    File file = new File(filename);
	    try {
	        Scanner sc = new Scanner(file);
	        sc.useDelimiter("\\t");
	        while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            System.out.println(i);
	        
	      //  System.out.println("enter a word or sentence");
	       // Scanner spells = new Scanner(System.in);
	       // spells.useDelimiter("\\t");
	       // while (spells.hasNextLine()) {
	          //  String j = spells.nextLine();
	        
	        //if (j.contains(i)){
	        	
	        	//System.out.println(j);
	        	
	        	
	       // }
	        
	       // else{
	        	
	        //	System.out.println("a word not match");
	        	
	      //  }
	       // }}
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		
		
		
	}
	
	
	
	
	
	
}
