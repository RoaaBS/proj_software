package fall2020project;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Appointment {
Patient person;
appointment app;
	errorhandling er; 
	
	public Appointment(Patient person,errorhandling e ) {
		this.person=person;
		er=e;
		
	}

	@Given("that the administrator is logged in")
	public void that_the_administrator_is_logged_in() {
		
		case1.loginflag=true;
	}

	@Given("there is a patient with id {string}")
	public void there_is_a_patient_with_id(String string) {
	   person.id=string;
	   
	}

	

	@Then("the patient with id {string}, name {string}, gender\"female\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\" is contained in the system")
	public void the_patient_with_id_name_gender_female_age_phone_number_d_o_a_final_diagnosis_cough_general_doctor_dima_awda_is_contained_in_the_system(String string, String string2, String string3, String string4, String string5) {
		assertTrue(app.added);
	}

	@Given("that the administrator is not logged in")
	public void that_the_administrator_is_not_logged_in() {
		case1.loginflag=false;
		app.added=false;
		 er.error="Administrator login required";
		
	}

	@Given("there is a patient with id  {string}, name {string}, gender\"female\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\"")
	public void there_is_a_patient_with_id_name_gender_female_age_phone_number_d_o_a_final_diagnosis_cough_general_doctor_dima_awda(String string, String string2, String string3, String string4, String string5) {
		assertTrue(app.added);
	}

	@When("the appointment  is added to the system")
	public void the_appointment_is_added_to_the_system() {
		app.added=true;
	}

	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
		assertEquals(er.error,string);
	}

	

	@Given("there is a patient with id   id {string} , name {string},gender\"male\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"vomiting  \",General Doctor\"mohammad abusamra\"")
	public void there_is_a_patient_with_id_id_name_gender_male_age_phone_number_d_o_a_final_diagnosis_vomiting_general_doctor_mohammad_abusamra(String string, String string2, String string3, String string4, String string5) {
		person.id=string;
		person.name=string2;
		person.gender=string3;
		 person.age=string4;
		 person.FinalDiagnosis=string5;
		// person.companynumber=int1;
		person.GeneralDoctor=string;
	//	person.phonenum=int1;
	}

	@When("the appointment  is\"{int}\\/{int}\\/{int}\"")
	public void the_appointment_is(Integer int1, Integer int2, Integer int3) {
	  
	}


}
