
public class Calender2 {
	

	public static void main(String[] args) {
		int counter=1;
	//for(int i=1; i<=5; i++)		{
		
		
		
		for (int j=1; j<=31; j++){
			 
			System.out.printf("%d\t",j );
			counter++;
			if(counter>7){
				
				System.out.println();
			counter=1;
			}
		}
		
	//}	

}}