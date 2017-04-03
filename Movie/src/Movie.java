import java.util.Scanner;
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movies[] = new String[3];
		

			Scanner scan = new Scanner(System.in);
     System.out.println("enter movie 1");
    movies[0]= scan.nextLine();
     System.out.println("enter movie 2");
     movies[1]= scan.nextLine();
     System.out.println("enter movie 3");
     movies[2]= scan.nextLine();
    // System.out.printf("Enter movie %d",i);
   for(int i=0; i<movies.length;i++)
    	 System.out.println(movies[i]);
	}
	
	

	}
