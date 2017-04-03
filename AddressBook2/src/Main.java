import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addresses addr = new Addresses();
Addresses addr2 = new Addresses();

ArrayList<Addresses> personaddress= new ArrayList<Addresses>();
     addr.setName("Ajao");
	addr.setEmail("ynkpraise@test.c");
	addr.setPhone("443-386-31-42");
	addr.setCity("Lagos");
	addr.setState("NewYork");
	addr.setZipcode("30839");
	 personaddress.add(addr);
	
	addr2.setName("Olayinka");
	addr2.setEmail("ynk@test.com");
	addr2.setPhone("443-386-31-42");
	addr2.setCity("Lag");
	addr2.setState("DC");
	addr2.setZipcode("3048959");
	
	 personaddress.add(addr2);

for(Addresses pers : personaddress)
System.out.printf(pers.useraddress() + "\t");
	}

}
