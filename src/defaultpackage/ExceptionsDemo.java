package defaultpackage;

import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		try {
			System.out.println("Before Withdrawal");
			acc.withdraw(100);
			System.out.println("After Withdrawal");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Please try after some time");
		}
		finally{
			System.out.println("Finally block always executes");
		}

	}

}
