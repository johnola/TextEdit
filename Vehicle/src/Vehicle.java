
public class Vehicle {
private String car_name;
private String car_color;
private String position;

public Vehicle(String names, String colors, String positions){
	this.car_name =names;
	this.car_color=colors;
	this.position= positions;
	
	
	
}
public Vehicle(){}
public void setname(String name){
	this.car_name = name;
	
}

public String getcarcolor(){
	
	return car_color;
}
public void setcolor(String color){
	this.car_color = color;
	
}

public String getcarname(){
	
	return car_name;
}

public String getposition(){
	
	return position;
}
public void setposition(String positions){
	this.position = positions;
	
}
public void outputs(){
	
	System.out.printf ("The %s %s is %s\n", this.getcarcolor(), this.getcarname(), this.getposition());
}
}
