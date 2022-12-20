package fall2020project;

import java.util.ArrayList;
import java.util.Calendar;

public class appointment extends app {
	public String id;
	public String name;
	public String age;

	public String gender;
	public String phone_number;
	public DateServer dateServ;
	public String company_number;
	public String GeneralDoctor; 
	public String FinalDiagnosis;
	public EmailServer emailServer= new EmailServer();
	public  Calendar d_o_a  ;
	public boolean added;
	public boolean delete;
	public boolean visit;

	public static ArrayList<appointment> app ;
	public appointment() {
		dateServ= new DateServer();
	}
	public void setDateServer(DateServer dateServ) {
		this.dateServ=dateServ;
		
	}
	public void setEmailServer(EmailServer emailServer) {

	}
	public void sendreminder(String email ,String su ,String body) {
		appointment.senEmail(email, su, body);
	}
	public static void senEmail(String email ,String subject,String body) {
		appointment.senEmail(email, subject, body);
	}
	public void add(int i, String date) {
	}}
	
