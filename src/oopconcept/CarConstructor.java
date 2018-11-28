package oopconcept;

public class CarConstructor {
	
	
	//Constructors get called automatically when an object of a class is created
	//They hold the same name as the class unlike methods
	//There is a default constructor and that doesn't have any argument
	private String make;
	int speed;
	int gear;
	
	public CarConstructor() { //Default no argument constructor
		
	System.out.println("Executing the constructor without argument");
	this.speed = 0;
	this.gear = 0;
	
	}
	 //There can be multiple constructors inside the class. They can take different number of arguments
	//Usually constructors are used to initialize instance variable values like private String make
	
	public CarConstructor(int speed, int gear) { //Constructor with argument 
		
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing the constructor with arguments");
		
		
		}
	
public String getMake(){
		
		return this.make;  //going to return the value of make variable
	}
	
	public void setMake(String make){
		
		this.make = make; //this is a special keyword that accesses the class variable
						  //this keyword knows the instance of the car object
		
		}

}
