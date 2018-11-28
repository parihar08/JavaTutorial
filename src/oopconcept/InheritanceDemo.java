package oopconcept;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 0;
		CarsInheritance c1 = new CarsInheritance(speed);
		c1.increaseSpeed();
		c1.decreaseSpeed();
		System.out.println("***************************************");
		
		BMWInheritance b1 = new BMWInheritance(speed);  
		b1.increaseSpeed();                            //Overriding the functions of the parent class
		b1.decreaseSpeed();
		b1.ledDisplay();  //We cannot call this method from the parent CarsInheritance class as this is BMWInheritance child class specific method
				
	}

}

