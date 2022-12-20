package fall2020project;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class update {
	DateServer dateServer = new DateServer() ;
	Patient personn;
	
boolean update=false;

	appointment aapp;
		errorhandling er;
	
		update(appointment i){
			aapp=i; }	
		public update(Patient person,errorhandling e,appointment new_aapp ) {
			this.personn=person;
			this.aapp=new_aapp;
			er=e;
			
		}
	
	

		@Given("The user needed change an appointment and he is logout")
		public void the_user_needed_change_an_appointment_and_he_is_logout() {
			case1.loginflag=false;

		}

		@Then("update failed")
		public void update_failed() {
			
			personn.update=false;
			 er.error="Administrator login required";
		}

	@Given("The user  need update an appointment and he is in system")
		public void the_user_need_update_an_appointment_and_he_is_in_system() {
			case1.loginflag=true;
	}
		

		@Then("update done")
		public void update_done() {
			// aapp.dateServ=date;
				personn.update=true;

		   
		}


	
		

}