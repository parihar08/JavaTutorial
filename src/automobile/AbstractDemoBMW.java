package automobile;

public class AbstractDemoBMW extends AbstractCars{
	
	public static void main(String[] args){
	//AbstractCars c1 = new AbstractCars()  //We cannot create object of the abstract class
	//We have to inherit the abstract classes in order to use them using extends
	AbstractDemoBMW a1 = new AbstractDemoBMW();
	a1.engineStart();
	a1.engine("BMW", 2);
		
	}
	
	public void engineStart(){
		super.engineStart();
		System.out.println("BMW has a keyless engine start");
		

	}

	@Override
	public void engine(String keyType, int numOfCyl) {
		// TODO Auto-generated method stub
		System.out.println("In the abstract method with the KeyType: "+keyType+" and "+numOfCyl+" number of cylinders");
		
	}

}
