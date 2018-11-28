
package introduction;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numDays = numOfDays(2000,2);
		System.out.println("Number of days in given year and month are: "+ numDays);
		System.out.println("Number of days in given year and month are: "+ numOfDays(2018,8));
		System.out.println("Number of days in given year and month are: "+ numOfDays(2016,13));
		System.out.println("Number of days in given year and month are: "+ numOfDays(2019,2));
		

	}
	
	static int numOfDays(int year, int month) {
		
		int numDays = 0;
		
		switch(month) {
		
		case 1:
			numDays = 31;
			break;
			
		case 2:
			if(year % 400 == 0){
				numDays = 29;
			}
			else {
				numDays = 28;
			}
			break;
			
		case 3:
			numDays = 31;
			break;
			
		case 4:
			numDays = 30;
			break;
			
		case 5:
			numDays = 31;
			break;
			
		case 6:
			numDays = 30;
			break;
		
		case 7:
			numDays = 31;
			break;
			
		case 8:
			numDays = 31;
			break;
			
		case 9:
			numDays = 30;
			break;
			
		case 10:
			numDays = 31;
			break;
			
		case 11:
			numDays = 30;
			break;
			
		case 12:
			numDays = 31;
			break;
			
		default:
			System.out.println("Please enter valid month");
			
		}
		
		return numDays;
	
	}

}
