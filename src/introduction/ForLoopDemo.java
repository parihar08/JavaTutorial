package introduction;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i=0;i<10;i++) {
		System.out.println("The value of i is: "+i);
	}
	
	int[] numbers = {10,20,30};
	for(int i=0;i< numbers.length;i++){
		System.out.println("The value of index "+i + " of array is: "+numbers[i]);
	}
		
	int[] scores = {98,96,95};
	for(int score:scores){
		System.out.println("The value is: "+score);
	}
	
	String[] cars = {"bmw","audi","mercedes"};
	for(String car:cars){
		System.out.println("My car is: "+car);
	}
	
	}

}
