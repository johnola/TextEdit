
public class Bird extends Animal{
	public Bird()
	{
	super();
	System.out.println("Now I am a Cat!");
	}

	@Override
	public String sleep() {
		return "A cat sleeps...";
	}

	@Override
	public String eat() {
		return "A cat eats...";
	}

	public String purr(){
		return "purrr...";
	}
	public String fly(){
		return "A bird flies...";
	}

}
