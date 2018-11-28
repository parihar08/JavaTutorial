package automobile;

public abstract class AbstractCars {
	
//Abstraction is the process of hiding some implementation from the user(other class).
//Only functionality should be available(methods), Implementation of methods should not be shown
//Abstraction in Java can be achieved in 2 ways. 1. Abstract Classes    2. Interfaces
//The class must be abstract if we want to define an abstract method inside it
//However abstract class may or may not have any abstract method
//There is a limitation of abstract classes that we cannot instantiate the abstract classes. i.e we cannot create object of abstract class
//But we can extend the abstract classes and use all the methods available in the child classes
	
	private int privateSpeed;
	public int publicSpeed;
	protected int protectedSpeed;
	int speedLimit = 100;
	
	public AbstractCars(){
		this(0);
	}
	
	public AbstractCars(int startSpeed){
		this.privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed){
		this.privateSpeed = pSpeed;
	}
	
	public void engineStart(){
		System.out.println("Engine Started");
		
	}
	
	public abstract void engine(String keyType, int numOfCyl);    //Abstract methods don't have any body. Any class inheriting the AbstractCars class
																 // will have to implement the abstract engine method

}
