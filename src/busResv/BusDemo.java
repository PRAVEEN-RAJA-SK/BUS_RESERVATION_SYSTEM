package busResv;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException, ParseException {
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();
		
		int userOption=1;
	
		while(userOption==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOption = sc.nextInt();
			if(userOption == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookdao = new BookingDAO();
					bookdao.addBooking(booking);
					System.out.println("Your Booking was confirmed enjoy the journey...");
				}else {
					System.out.println("Sorry Your was not confirmed Bus is full try for another bus");
				}
			}
		
		}

	}

}
