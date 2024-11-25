package busproject;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class bus {
//instanceVariables
private int capacity;
private	boolean ac;
private Date busdate;
static int mainbuscap;

bus(int space ,boolean ac,String ddMMyyyy){
SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
try {
	busdate = sf.parse(ddMMyyyy);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
capacity=space;
this.ac=ac;
}



int getcapacity(){
return this.capacity;
}
boolean getac() {
return ac;
}
public Date date() {
	return busdate;
}
void display() throws InterruptedException{
	
	for(int i=1; i<=5; i++) {
	Thread.sleep(1000);
	System.out.print(".");
	}
	System.out.println();
	Thread.sleep(2000);
System.out.println("Current Capacity - "+this.capacity + "\na/c - " + this.ac +"\nTravel_date - " + this.date());	
}
void setcapacity(int space){
capacity =space;	
}
void setac(boolean ac) {
this.ac = ac;
}



static void available(booking book,ArrayList<bus>buses){

	 for(bus b : buses) {
		 if(b.date().equals(book.getdate()) && ((b.getcapacity()>=0)))
	{
		   System.out.println();
		   System.out.println("  DETAILS  ");
		   System.out.println("Available Buses on "+book.getdate()+"\n");
		   mainbuscap = b.getcapacity();
		 
		 try {
			b.display();
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	}
		if(b.getcapacity()<=0) {
			   
		    	System.out.println("THE BUS LOOKS FULL  ON THAT DAY , WE WILL UPDATE SOON");
		    	int a = b.getcapacity();
		    	mainbuscap =a;
		    	break;
		                        }

		 }

}



}
