package oopconcept;

public class Car {
	
	private String color;  //member variable or class variable. We store the state of the Car object in these variables
	
	private String make;
	
	private String model;
	
	private int year;
	
	//Setters (A method that is used to set the value of a filed or a variable and doesn't return anything)
	//Getters ()
	//Make all the class variables as private and hide them from outside so that only class can use them
	//Concept is called Encapsulation
	public void increaseSpeed(){
		
		System.out.println("Increasing the speed of the car");
	}
	
	public String getMake(){
		
		return this.make;  //going to return the value of make variable
	}
	
	public void setMake(String make){
		
		this.make = make; //this is a special keyword that accesses the class variable
						  //this keyword knows the instance of the car object
		
		}
	
	//Similarly we can define getters and setters for all the member variables automatically
	// that we want to use outside the class. Right click > Source >Generate Getters and Setters 

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 1900){
			this.year = year;
		}
		else{
			System.out.println("This is not a valid year");
		}
		
	}
	
	
}
