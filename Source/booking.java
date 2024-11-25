package busproject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class booking {
	//instanceVariables

	private String name;
	private Long number;
	private Date datebook;
	private int  currentcap;
	private int seatconformation;

	//get and set methods.
	int getcurrentcap() {
		return currentcap;
	}
	int get_seatconformation(){
		return this.seatconformation;	
	}

	void set_seatconformation(int val) {
		this.seatconformation= val;
	}


	booking(){

		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter Passenger Name: ");
		name = scanner.next();
		System.out.println("Enter Contact number");
		number= scanner.nextLong();
		System.out.println("Enter Travel Date: (dd-mm-yyyy) ");
		String datein = scanner.next();

		// "highlighted_one"

		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		try {
			datebook =sd.parse(datein);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	String getname(){
		return name;
	}
	long getnumber() {
		return number;
	}
	void setname(String space){
		name =space;	
	}
	void setnumber(long num) {
		number = num;
	}

	Date getdate() {
		return datebook;
	}


	void reserve(ArrayList<bus> buses){

		for(bus b : buses) 
		{
			FOR1:
				if((b.date().equals(this.datebook))) {

					if((b.getcapacity()<this.seatconformation)) {
						System.out.println("Input Invalid | Please choose Seats Properly");
						break FOR1;
					}

					if((b.date().equals(this.datebook))) {

						currentcap = b.getcapacity() - this.seatconformation;
						b.setcapacity(currentcap);


						this.finalconfirmation();
					}

				}

		}
	}

	public void finalconfirmation(){
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Booking Confirmed..");

		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Seats - "+this.seatconformation +"\n"+"date - "+this.datebook );
		System.out.println("HAPPY JOURNY");
	}


}



