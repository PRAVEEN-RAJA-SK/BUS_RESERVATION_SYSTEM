package busResv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		int userOption=1;
		while(userOption==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOption = sc.nextInt();
			if(userOption == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking was confirmed enjoy the journey...");
				}else {
					System.out.println("Sorry Your was not confirmed Bus is full try for another bus");
				}
			}
		
		}

	}

}
