package oopconcept;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();  //create and initialize the object
		//type(Car) object name (bmw) = new (keyword to create and initialize the object)
		bmw.setMake("BMW");
		System.out.println("Make of the BWM is: "+bmw.getMake());
		
		Car benz = new Car();
		benz.setModel("Model of the Benz is: "+"c300");
		benz.setMake("Make of the Benz is: "+"Benz");
		System.out.println(benz.getMake());
		System.out.println(benz.getModel());
		
		benz.setYear(1800);
		System.out.println("Year of the Benz is: "+benz.getYear()); //returns us the default value of integer: 0
		}															//as we couldn't set the value of year since year<1900

}
