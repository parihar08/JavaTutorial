package automobile;

import automobile.Cars;

public class AccessModifiersDemo {
	
	//Access Modifiers limit the scope of variables and methods(from where they can be accessible)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars c1 = new Cars();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(15);
		c1.publicSpeed = 90;
		c1.protectedSpeed =100;
		c1.decreaseProtectedSpeed();
		System.out.println("***************************************");
		BMW b1 = new BMW(10);
		b1.increaseSpeed();
		
		
	}

}
