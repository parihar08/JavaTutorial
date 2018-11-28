package automobile;

public class Cars {
	
	int speed;
	private int privateSpeed;   //private variables and methods are only available in class. They cannot be used outside the class
								//Only way we can use these outside our class is by using getters and setters public method
	
	public int publicSpeed;     //Import anywhere in java when we import package and the class
	
	protected int protectedSpeed; //Protected variable is available in any method defined as protected. 
								  //Protected variable/method should also be available anywhere in any class within the same package.
								  //Protected variable/method are accessible to any subclass even if that subclass is outside of the package
	
	
	int speedLimit =100;
	
	public Cars(){
		
		this(0);
		
	}
	
	public void setPrivateSpeed(int pSpeed){
		privateSpeed = pSpeed;
		System.out.println("Private speed set to:"+ privateSpeed);
	}
	
	public Cars(int startSpeed){
		speed = startSpeed;
	}
	
	public void increaseSpeed(){
		if(speed<100){
		speed++;
		}
		System.out.println("Increasing public speed");
	}
	
	protected void decreaseProtectedSpeed(){	
		if(speed>100){
			speed--;
			}
		System.out.println("Decreasing protected speed");
		
	}
	
}
