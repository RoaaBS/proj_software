package fall2020project;

import java.util.Calendar;
import java.util.GregorianCalendar;

import fall2020project.Patient;
import fall2020project.appointment;

import fall2020project.DateServer;
public class DateHolder {
	DateServer dateServer = new DateServer() ;
	
	public static appointment app;
	public static Calendar nextdate ;
	

	public  DateHolder (appointment app) {
		this.app=app;
	app.setDateServer(dateServer);	


	}
	public  void setDate(Calendar calender) {
		dateServer.setDate(calender);
		app.setDateServer(dateServer);
	}
	public  void advance(int int1) {
		 nextdate =dateServer.getDate();
		nextdate.add(Calendar.DAY_OF_YEAR, 10);
		this.setDate(nextdate);
		
	}
}
