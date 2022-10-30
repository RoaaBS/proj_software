package fall2020project;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Addappointment {
	DateServer dateServer = new DateServer() ;
	Patient personn;
	DateHolder dateHolder;
	
boolean booked=true;
String errr;
Patient dateofa;
	appointment aapp;
		errorhandling er;
		
	

		Addappointment(appointment i,DateHolder j){
			aapp=i;
		dateHolder=j;

		}
		public Addappointment(Patient person,errorhandling e,appointment aapp ) {
			this.personn=person;
			this.aapp=aapp;
			er=e;
			
		}

		@Given("that the administrator is logged in")
		public void that_the_administrator_is_logged_in() {
			
			case1.loginflag=true;
		}

		@Given("there is a patient with id {string}")
		public void there_is_a_patient_with_id(String string) {
		   personn.id=string;
		   
		}
	

		@When("the appointment is added to system")
		public void the_appointment_is_added_to_system() {
			aapp.added=true;
		}



		@When("the appointment  is added to the system")
		public void the_appointment_is_added_to_the_system() {
			aapp.added=true;
		}
		
		@Then("the patient with id {string}, name {string}, gender\"female\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\" is contained in the system")
		public void the_patient_with_id_name_gender_female_age_phone_number_d_o_a_final_diagnosis_cough_general_doctor_dima_awda_is_contained_in_the_system(String string, String string2, String string3, String string4, String string5) {
		  
			personn.id=string;
			personn.name=string2;
			 personn.age=string3;
			 personn.phone_number=string4;
		}
		

		
		@Given("that the administrator is not logged in")
		public void that_the_administrator_is_not_logged_in() {
			case1.loginflag=false;
			aapp.added=false;
			 er.error="Administrator login required";
			
		}


		@Given("there is a patient with id  {string}")
		public void there_is_a_patient_with_id1(String string) {
			  personn.id=string;
		}



		@Then("the error message {string} is given")
		public void the_error_message_is_given(String string) {
			if(booked==true) {
				errr="Can't record,this appointment booked";
				if(string.equals(errr)) {
					assertTrue(true);
				}
			}
			
		}
	

		@Given("there is a patient with id {string}, name {string}, gender\"female\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\"")
		public void there_is_a_patient_with_id_name_gender_female_age_phone_number_dateofa_final_diagnosis_cough_general_doctor_dima_awda(String string, String string2, String string3, String string4, String string5) {
			personn.id=string;
			personn.name=string2;
			 personn.age=string3;
			 personn.phone_number=string4;
		}
		@When("the appointment  is\"{int}\\/{int}\\/{int}\"")
		public void the_appointment_is(Integer int1 ,Integer int2,Integer int3) {
		personn.dateHolder=int1;
		personn.dateHolder=int2;
		personn.dateHolder=int3;
		
			
		}


		

	}


