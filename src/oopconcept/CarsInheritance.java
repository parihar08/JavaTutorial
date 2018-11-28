package oopconcept;

public class CarsInheritance {
	
	int speed;
	
	public CarsInheritance(int startSpeed){
		speed = startSpeed;
	}
	
	public void increaseSpeed(){
		speed++;
		System.out.println("Increasing speed");
	}
	
	public void decreaseSpeed(){	
		speed--;
		System.out.println("Decreasing speed");
		
	}
	
}
