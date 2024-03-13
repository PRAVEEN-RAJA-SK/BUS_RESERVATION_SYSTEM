package busResv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
            String passengerName;
            int busNo;
            Date date;
            
            Scanner sc = new Scanner(System.in);
            
            Booking() throws ParseException{
            	System.out.println("Enter name of Passenger : ");
            	passengerName = sc.next();
            	
            	System.out.println("Enter bus no : ");
            	busNo = sc.nextInt();
            	
            	System.out.println("Enter date dd-mm-yyyy");
            	String dateInput = sc.next();
            	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            	date = dateFormat.parse(dateInput);
            			
            }

			public boolean isAvailable() throws SQLException{
			    
				BusDAO busdao = new BusDAO();
				BookingDAO bookingdao = new BookingDAO();
				int capacity = busdao.getCapacity(busNo);
				int booked = bookingdao.getBookedCount(busNo,date);
				return booked<capacity;
			}
}
