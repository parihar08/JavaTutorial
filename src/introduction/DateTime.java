package introduction;

import java.util.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTime {
		
		public static void main( String[] args )
	    { 
		Date d = new java.util.Date();
		System.out.println("Current Time Stamp: " + d);
		Date date1 = java.util.Calendar.getInstance().getTime();
		System.out.println("Current Time Stamp: " + date1);
		
		 Date date= new Date();
		 
		 long time = date.getTime();
		     System.out.println("Time in Milliseconds: " + time);
		 
		 Timestamp ts = new Timestamp(time);
		 System.out.println("Current Time Stamp: " + ts);
		 
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		 Date dateobj = new Date();
		 System.out.println(df.format(dateobj));
		    }
	}
