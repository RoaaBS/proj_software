package fall2020project;
import java.util.ArrayList;
import java.util.Calendar;

import fall2020project.DateServer;
import fall2020project.EmailServer;

public class Patient extends person{
	public String id;
	public String name;
	public String age;

public String price;
	public String gender;
	public String phone_number;
	public String email;
	public DateServer dateServ;
	public String company_number;
	public String GeneralDoctor; 
	public String FinalDiagnosis;
	public EmailServer emailServer= new EmailServer();
	public DateServer dateServer = new DateServer() ;
	public  Calendar d_o_a  ;
	
public boolean added;
public Integer dateHolder;
public String tyb;
public static ArrayList<Patient> person ;

public Patient() {
	dateServ= new DateServer();

}

public void setDateServer(DateServer dateServ) {
	
	
}
public void setEmailServer(EmailServer emailServer) {

}
public void sendreminder(String email  ,String su,String body) {
	appointment.senEmail(email, su, body);
}

public void setDate(Calendar calender, Patient personn) {
	dateServer.setDate(calender);

	
	personn.setDateServer(dateServer);
	
}

}




