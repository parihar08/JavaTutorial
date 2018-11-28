package automobile;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo myInterface = new InterfaceDemo();
		//CarsInterface myInterface = new InterfaceDemo(); //if we want to create an object we can give the type as interface as well 
														   //because our class is anyways implementing the interface and will have all the properties
				
		myInterface.engineStart("6 cylinder", true);
		myInterface.headsUpNavigation();

	}

}
