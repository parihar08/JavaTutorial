package oopconcept;

public class BMWInheritance extends CarsInheritance{

	public BMWInheritance(int startSpeed){
		super(startSpeed);  
// super is the keyword used to access anything from the parent class
	}
		public void increaseSpeed(){
			speed++;
			System.out.println("Increasing speed of the child");
		}
		
		public void decreaseSpeed(){	
			speed--;
			System.out.println("Decreasing speed of the child");
		}
		
		public void ledDisplay(){
			System.out.println("BMW Specific Functionality");
		}
	
}
