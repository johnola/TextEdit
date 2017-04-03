import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
	int a ,b, result;
	 try{
	 
	
 Scanner input = new Scanner(System.in);

 
  System.out.println("Input two numbers");
 
  a = input.nextInt();
  b = input.nextInt();

  result = a / b;

  System.out.println("Result = " + result);
	 
	  }
catch (Exception e)
	{
	    System.out.println("input numbers other than 0");
	}

}}