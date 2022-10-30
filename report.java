package fall2020project;
import java.util.ArrayList;
import java.util.Calendar;

import io.cucumber.java.en.Given;
public class report extends person{
	




		public String name;
		public String id;
		public String percentage_of_increase;
		public boolean added;
		public DateServer dateServ;
		public EmailServer emailServer= new EmailServer();
		public Calendar d_o_a ;
		public boolean late=false;
		
		public static ArrayList<service> iitems ;
		public report() {
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


