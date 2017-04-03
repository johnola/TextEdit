import java.util.Random;
public class Main{

	public static void main(String[] args) {
		
		Random rnd = new Random();
	 int die1, die2, counter;
	 counter =0;
	 
	 die1 =rollDie(rnd);
	 die2 =rollDie(rnd);
	 
	 while (die1==die2)
	 {
		 
		 
		System.out.printf("User rolls %d & %d/n", die1, die2);
		System.out.println("DOUBLES!");
		counter++;
		
		if(counter>=3)
		
		{
		break;	
			
		}
		 
		 System.out.printf("Move %d spacess and roll again getting...%n", die1+die2);
		 
		 die1=rollDie(rnd);
		 die2=rollDie(rnd);
		 }
		 if (counter<3){
				System.out.printf("User rolls %d & %d/n", die1, die2); 
				System.out.printf("Move %d spaces and stop", die1+die2);
			 
			 
		 }
		 else{
			 
			 
			 System.out.println("GO TO JAIL ...");
		 }
	 }
	 
	 
	


	
	 public static int rollDie(Random rnd)
	 {
		 
		 int dieRoll = 1+rnd.nextInt(6);
		 return dieRoll;
	 }

}