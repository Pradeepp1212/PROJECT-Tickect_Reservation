package busproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args)
	{
		int useropt=1;
		int confirm;
	//ADMIN AREA.	
	ArrayList<bus> buses = new ArrayList<>();
	ArrayList<booking> book = new ArrayList<>();
	
	buses.add(new bus(2,true,  "21-07-2024"));
	buses.add(new bus(10,true, "22-07-2024"));
	buses.add(new bus(50,false,"12-12-2024"));
	
	
	//ADMIN AREA ENDS
	
	System.out.print("Enter 1 to BOOK 2 to Exit ");
	
	while(useropt==1) {
	
	Scanner scanner = new Scanner(System.in);
		  useropt = scanner.nextInt();
		  
	if(useropt==1) System.out.println("Welcome");
	else if (useropt ==2){
			
			System.out.println("OK,See you again.");
			break;
		     }
		// if 1 the cons get invoked
	 booking bookings = new booking();//the constructor automatically intakes details here
	 
	 bus.available(bookings, buses);//shows available buses.
	
	 int able=2;
	 int capofbus =  bookings.getcurrentcap();
	 
	 if(bus.mainbuscap>0) {
		 System.out.println("PRESS 1 TO ENTER REGISTER PROCESS | 2 TO EXIT");
	 }
     Scanner scanner2 = new Scanner (System.in);
     able = scanner2.nextInt();
	 
     if(able==2) System.out.println("OK,see you soon");
     
     
//     confirm = bookings.get_seatconformation();
   
	 while(able==1) {
		     System.out.println("Enter How Many Seats : *NOTE TOTAL SEATS IS SHOWING CURRENT BUS CAPACITY*");
		
		     Scanner scanner3 = new Scanner(System.in);
		     bookings.set_seatconformation(scanner3.nextInt());
		     able=2;
		     }
	
	 bookings.reserve(buses);
	
	 System.out.println("Again You Wanna Book Please Enter \"1\"");
	 
	}//while ends
 
	
}

}
