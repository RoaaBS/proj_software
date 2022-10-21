package fall2020project;

import java.util.Calendar;

public class DateServer {
public  Calendar datedserver;
 
	
	public DateServer() {
		
		datedserver=getDate();
	}
	public void setDate(Calendar date) {
		
		datedserver=date;
	}
	public Calendar getDate() {
		
        return Calendar.getInstance();
        
	}

}
