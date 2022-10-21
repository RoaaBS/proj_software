package fall2020project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import fall2020project.Patient;
import fall2020project.errorhandling;





public class record_patient {
	Patient person;
	appointment app;
		errorhandling er;
	
		
		public record_patient(Patient person,errorhandling e ) {
			this.person=person;
			er=e;
			}
		
@Given("that the admin is logged in")
public void that_the_admin_is_logged_in() {
	case1.loginflag=true;
}

@Given("ther is a patient with id {string} , name {string},gender\"female\", ,age {string},phone number \"{int}\",D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\",company number\"{int}\"")
public void ther_is_a_patient_with_id_name_gender_female_age_phone_number_d_o_a_final_diagnosis_cough_general_doctor_dima_awda_company_number(String string, String string2, String string3, String string4, String string5, Integer int1) {
  
person.id=string;
person.name=string2;
person.gender=string3;
 person.age=string4;
 person.FinalDiagnosis=string5;
 person.companynumber=int1;
person.GeneralDoctor=string;
person.phonenum=int1;
 
}

@When("the patient with id {string} register")
public void the_patient_with_id_register(String string) {
	assertTrue(person.added);
}



@Given("that the admin is not logged in")
public void that_the_admin_is_not_logged_in() {
	case1.loginflag=false;
	person.added=false;
	 er.error="Administrator login required";
}

@Given("ther is a patient with  id {string} , name {string},gender\"male\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"vomiting  \",General Doctor\"mohammad abusamra\",company number\"{int}\"")
public void ther_is_a_patient_with_id_name_gender_male_age_phone_number_d_o_a_final_diagnosis_vomiting_general_doctor_mohammad_abusamra_company_number(String string, String string2, String string3, String string4, String string5, Integer int1) {
	person.id=string;
	person.name=string2;
	person.gender=string3;
	 person.age=string4;
	 person.FinalDiagnosis=string5;
	 person.companynumber=int1;
	person.GeneralDoctor=string;
	person.phonenum=int1;
}

@Then("error message {string} is given")
public void error_message_is_given(String string) {
	assertEquals(er.error,string);
}

@Given("that the admin is logged in and the patient is already registered")
public void that_the_admin_is_logged_in_and_the_patient_is_already_registered() {
	case1.loginflag=true;
	person.added=false;
	 er.error="patient is already registered";
}

@Given("ther is a patient withid {string} , name {string},gender\"female\", ,age {string},phone number {string},D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\",company number\"{int}\"")
public void ther_is_a_patient_withid_name_gender_female_age_phone_number_d_o_a_final_diagnosis_cough_general_doctor_dima_awda_company_number(String string, String string2, String string3, String string4, String string5, Integer int1) {
	person.id=string;
	person.name=string2;
	person.gender=string3;
	 person.age=string4;
	 person.FinalDiagnosis=string5;
	 person.companynumber=int1;         //there is a mistake o error not all input are defined//
	person.GeneralDoctor=string;
	person.phonenum=int1;
}

}
