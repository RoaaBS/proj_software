package fall2020project;



import java.util.Calendar;

import fall2020project.DateServer;
import fall2020project.EmailServer;

public class Patient extends person{
	public String id;
	public String name;
	public String age;

	public String gender;
	public int phonenum;
	public DateServer dateServ;
	public int companynumber;
	public String GeneralDoctor; 
	public String FinalDiagnosis;
	public EmailServer emailServer= new EmailServer();
	public  Calendar D_O_A  ;
public boolean added;
public Patient() {
	dateServ= new DateServer();

}
public void setDateServer(DateServer dateServ) {
	this.dateServ=dateServ;
	
}
public void setEmailServer(EmailServer emailServer) {

}
public void sendreminder(String email ,String su ,String body) {
	emailServer.senEmail(email, su, body);
}

}
