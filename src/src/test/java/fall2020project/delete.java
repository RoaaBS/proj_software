package fall2020project;


import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class delete {
/*	DateServer dateServer = new DateServer() ;*/
	Patient personn;
	
/*boolean delete=true;*/

	appointment aapp;
		errorhandling er;
	
		/*delete(appointment i){
			aapp=i; }*/	
		public delete(Patient person,errorhandling e,appointment aapp ) {
			this.personn=person;
			this.aapp=aapp;
			er=e;
			
		}
		@Given("The user wants to delete an appointment and he is not logged in")
		public void the_user_wants_to_delete_an_appointment_and_he_is_not_logged_in() {
			case1.loginflag=false;
			aapp.delete=false;
			 er.error="Administrator login required";
			

		}

		@Then("show {string}")
		public void show(String string) {
			aapp.delete=true;
		}

		@Given("The user wants to delete an appointment and he is logged in")
		public void the_user_wants_to_delete_an_appointment_and_he_is_logged_in() {
			case1.loginflag=true;
			
		}

		@Then("delete this appointment and this appointment is available now")
		public void delete_this_appointment_and_this_appointment_is_available_now() {
	
			
		aapp.delete= false;
		}
		


}