package automobile;

public interface CarsInterface {
	
	//It is a collection of abstract methods(signatures of the method without implementation)
	//Any class that implement an interface will implement all the methods that reside inside the interface by defining methods	
	
	public String speed = "100";
	
	public void engineStart(String engineType,boolean isKeyLess);
	
	//We need a class to implement an interface

}
