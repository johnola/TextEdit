
public class CarApp {

	public static void main(String[] args) {
		Vehicle veh = new Vehicle("Porsche","Red", "Starting");
		Vehicle veh1 = new Vehicle("jetta","blue", "Starting");
		Vehicle veh2 = new Vehicle("jetta","blue", "accelerating");
		Vehicle veh3 = new Vehicle("jetta","blue", "accelerating");
		Vehicle veh4 = new Vehicle("jetta","blue", "has stopped to have its emissions checked");
		Vehicle veh5 = new Vehicle("jetta","blue", "passes its emission test");
		Vehicle veh6 = new Vehicle("Porsche","Red", "Stopped");
		Car c = new Car("Porsche","Red", "going",50);
		Car c2 = new Car("blue","jetta", "just passed","red", "porsche");
		veh.outputs();
		veh1.outputs();
		veh2.outputs();
		veh3.outputs();
		veh4.outputs();
		veh5.outputs();
		veh6.outputs();
		
		c.outputs();
		c2.anotheroutputs();
	}

}
