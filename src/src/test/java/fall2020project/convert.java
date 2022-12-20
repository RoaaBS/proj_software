package fall2020project;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class convert {
	DateServer dateServer = new DateServer() ;
	Patient personn;
	boolean viset=false;
	appointment aapp;
	errorhandling er;

	convert(appointment i){
		aapp=i; }	
	public convert(Patient person,errorhandling e,appointment aapp ) {
		this.personn=person;
		this.aapp=aapp;
		er=e;
		
	}
	@Given("user come on time")
	public void user_come_on_time() {
	    // Write code here that turns the phrase above into concrete actions
aapp.visit=true;	}

	

	@Then("the appointment convert to visit")
	public void the_appointment_convert_to_visit() {
	   aapp.visit=false;
	}



}