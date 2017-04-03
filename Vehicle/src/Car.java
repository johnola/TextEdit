
public class Car extends Vehicle{
	private int speed;
	private String coloreds;
	private String namme;
	public Car(String names, String colors, String positions,int speeds){
		
		super(names, colors, positions);
		this.speed =speeds;
		
	}
public Car(String colorss,String namess, String positionss, String colored, String nammm){
		
		super(namess, colorss, positionss);
		this.coloreds =colored;
		this.namme= nammm;
		
	}
	public void setspeed(int speeds){
		this.speed = speeds;
		
	}
	public int getspeed(){
		
		return speed;
		
	}
	
	public void setnames(String namess){
		this.namme = namess;
		
	}

	public String getcarscolor(){
		
		return coloreds;
	}
	public void setcolorss(String colorss){
		this.coloreds = colorss;
		
	}

	public String getcarsname(){
		
		return namme;
	}

	
	public void outputs(){
		
		System.out.printf ("The %s %s is %s %d mph\n", this.getcarcolor(), this.getcarname(), this.getposition(), this.speed);
	}
public void anotheroutputs(){
		
		System.out.printf ("The %s %s %s the %s %s\n", this.getcarcolor(), this.getcarname(), this.getposition(),getcarscolor(), this.getcarsname());
	}
}
