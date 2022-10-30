package fall2020project;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class delete extends appointment {
	errorhandling er;
	appointment aapp;
	String datebooked;
	String Id;
	Patient personn;
	delete(appointment i){
	aapp=i;
	}
	@Given("that the admainn is not logged in")
	public void that_the_admainn_is_not_logged_in() {
		case1.loginflag=false;
		aapp.added=false;
		 er.error="Administrator login required";
	}
	@Given("there is a patientt with id  {string}")
	public void there_is_a_patientt_with_id(String string) {
		 personn.id=string;
	}
	
	@When("the appointment  is delete")
	public void the_appointment_is_delete() {
		aapp.delete=true;
	}

	@Given("The user wants to delete an appointment and he is logged in")
	public void the_user_wants_to_delete_an_appointment_and_he_is_logged_in() {
		case1.loginflag=true;
	}

	@Then("delete this appointment and this appointment is available now")
	public void delete_this_appointment_and_this_appointment_is_available_now() {
		aapp.delete=true;
	
	}

}
