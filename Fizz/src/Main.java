
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=100;
		for (int i=1; i<number+1; i++){

			if(i%3==0 && i%5!=0){

				System.out.println("Fizz");
               continue;
			}
			else if(i%5==0 && i%3!=0){

				System.out.println("buzz");
              continue;
			}
			
			else if(i%3==0 && i%5==0){

				System.out.println("fizzbuzz");
              continue;
			}
			System.out.println(i);
		}
	
	}
}


