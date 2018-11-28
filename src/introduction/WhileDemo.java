package introduction;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		boolean condition = 10 < 20;
		System.out.println(condition);
		
			while(i<20) {
			//System.out.println(i);
			i++;
			if (i==17){
				continue;		
			}
			System.out.println("Value of i is: "+i);	
		}
		System.out.println("Outside Loop ......");
	
	int j = 15;
	do {
		System.out.println("Value is: "+j);	
		System.out.println("Inside do while loop");
		j++;
	}
	while(i<20);

	}
}
