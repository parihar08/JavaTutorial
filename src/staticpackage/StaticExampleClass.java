package staticpackage;

public class StaticExampleClass {

// Static variables are always associated with the class instead of the class instance(object of the class)
// If we want to attach something to the class and not to the object we have to make it stactic
	private String make;
	private int instanceNum = 0;

	private static String model;
	static int instNum = 0;
	
	private static int wheelsCount = 4;
	
	public StaticExampleClass(String make,String model) {
		//Constructor of the class - we are setting the make and increment the instance number whenever a nw object of the class is created 
		this.make = make;
		this.model = model;
		instanceNum++;
		instNum++;
	}
	
	public String getMake() {
		
		return make;
	}
	
	public int getInstance() {
		
		return instanceNum;
	}
	
public String getModel() {
		
		return model;
	}
	
	public int getInst() {
		
		return instNum;
	}
	
 // We will create the object of this class in StaticDemo.java class file
}
