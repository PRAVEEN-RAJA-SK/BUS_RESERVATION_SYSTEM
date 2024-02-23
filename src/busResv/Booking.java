package busResv;

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

			public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
			    
				int capacity = 0;
				for(Bus bus : buses) {
					if(bus.getBusNo() == busNo) {
						capacity=bus.getCapacity();
						}
				}
				
				int booked = 0;
				
				for(Booking book : bookings) {
					if(book.busNo==busNo && book.date.equals(date)) {
						booked++;
					}
				}
				
				if(booked<capacity) {
					return true;
				}
				
				return false;
			}
}
