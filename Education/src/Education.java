import java.util.*;
public class Education {
	private String person;
	private String personn;
	ArrayList<String> list = new ArrayList<String>();
public Education(String persons){
	this.person = persons;
	
	
}
public Education(String persons1, String person2){
	this.person = persons1;
	this.personn = person2;
	
	
}
public Education(){
	
	
	
}
public void setPerson(String persons){
	
	this.person = persons;
	
}
public String getPerson(){
	
	return this.person;
	
}

public void lists(){
	
	list.add("sch1");
	list.add("sch2");
	list.add("sch3");
	list.add("sch4");
	list.add("sch5");
	list.add("sch6");
	list.add("sch7");
	list.add("sch8");
	list.add("sch9");
	list.add("sch10");
	for (String listing : list){
		
		System.out.println(listing);
		
	}
	
}
public String schoolist(){
	
	
	return "this is a school list for :" + this.getPerson();
}

}
