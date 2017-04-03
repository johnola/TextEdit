import java.util.Scanner;
public class Main {
	public static double side1 =0;
	public static double side2 =0;
	public static double side3 =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	
	
	
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter side 1");
		side1 = scan.nextDouble();
		System.out.println("Enter side 2");
		side2 = scan.nextDouble();
		System.out.println("Enter side 3");
		side3 = scan.nextDouble();
		if(side1==side2 && side1==side3 && side2==side3){
			
			System.out.println("equilateral triangle");}
			
		else if(Math.pow(side1, 2)==(Math.pow(side2,2)+Math.pow(side3,2))||Math.pow(side2, 2)==(Math.pow(side1,2)+Math.pow(side3,2))||Math.pow(side3, 2)==(Math.pow(side1,2)+Math.pow(side2,2))){
				
			System.out.println("Right Angle");	
				
				
			}
			
		else{
			
			
			System.out.println("Unknown");
		}
			
		}
	}


