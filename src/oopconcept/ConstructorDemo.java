package oopconcept;

public class ConstructorDemo {
	
	
	public static void main(String[] args) {
	
	CarConstructor c1 = new CarConstructor();  //create and initialize the object
	//type(Car) object name (bmw) = new (keyword to create and initialize the object)
	//constructor gets called when c1 object is created
	c1.setMake("BMW");
	System.out.println("Make of the BWM is: "+c1.getMake());
	System.out.println("Gear BWM is in: "+c1.gear);
	System.out.println("Speed of the BWM is: "+c1.speed);
	
	System.out.println("******************************");
	
	CarConstructor c2 = new CarConstructor(10,1);
	c2.setMake("Benz");
	System.out.println("Make of the Benz is: "+c2.getMake());
	System.out.println("Gear Benz is in: "+c2.gear);
	System.out.println("Speed of the Benz is: "+c2.speed);
	
	}

}
