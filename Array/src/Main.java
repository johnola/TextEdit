import java.util.Random;
public class Main {
public static void main(String[] args){
	
	
	        Random rnd = new Random();
	       int randomint;
	       int scores[]= new int[10];
	       for(int i=0; i<10;i++){
	    	   
	    	randomint=1+rnd.nextInt(100);
	    	scores[i]=randomint;
	    	   
	    	   System.out.printf("Element # %d value is %d\n",i, scores[i]);
	    	   
	    	   
	    	 //Print the number of elements
	           System.out.println("The array length is " + scores.length);
	           //Change an element
	           scores[0] = 100;
	           System.out.println("The first element is now 100");

	           
	           //this line will not generate the ArrayIndexOutOfBoundsException
	           //we'll learn more about Exception (error) handling soon
	         try{
	               System.out.println(scores[10]);
	           }catch(Exception e){
	               System.out.println("We caught the ArrayIndexOutOfBoundsException error");
	           }
	           
	           //this line will generate an ArrayIndexOutOfBoundsException
	           //since we did not wrap it in the try..catch for error handling 
	           //System.out.println(scores[10]);
	       }
	
	
}

}