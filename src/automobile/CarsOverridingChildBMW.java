package automobile;

public class CarsOverridingChildBMW extends CarsOverridingParent{
	
	/***
	 * Rules
	 * 1. Argument List: Argument List in the overriding method should be same as the parent class overridden method
	 * 2. Access Modifier: Access Modifier of the overriding method cannot be more restrictive than the overridden method(we cannot reduce)
	 * 3. private,static and final methods can not be overridden as they are local to the class but we can have our own implementation of them
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
		CarsOverridingParent p1 = new CarsOverridingChildBMW();
		//With the same object we will be able to call the methods from the parent as well child class	
		c1.engineStart(2);
		c1.staticExample();
		System.out.println("********Dynamic Method Dispatching: Child class object created by giving reference of Parent class**********");
		p1.increaseSpeed();
		p1.engineStart(3);
		p1.staticExample();
		
	}
		/***Another way to Override 
		public void engineStart(int cyl){
			System.out.println("I'm from the child class");
			}
		*/	
	
		@Override	
		public void engineStart(int cyl){
			super.engineStart(3);   //calls the method from the parent class
			System.out.println("I'm from the child class"); //prints from the child class
		}
		
		
		public static void staticExample(){
			// super.staticExample()  //we wont be able to call static example method from the parent class as it is static
			System.out.println("I'm the static method of the child class");
		}
			


}
