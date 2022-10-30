

package fall2020project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import fall2020project.Patient;
import fall2020project.errorhandling;

public class record_patient {
	Patient personn;
	
		errorhandling er;
	
		
		public record_patient(Patient personn,errorhandling e ) {
			this.personn=personn;
			er=e;
			}
	

		@Given("that the admin is logged in")
		public void that_the_admin_is_logged_in() {
			
			
			case1.loginflag=true;
		   
		}



       



@Given("ther is a patient with id {string} , name {string},gender {string}, ,age {string},phone number {string},D.O.A  {string},Final Diagnosis {string},General Doctor {string},company number {string}")
public void ther_is_a_patient_with_id_name_gender_age_phone_number_d_o_a_final_diagnosis_general_doctor_company_number1(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
	personn.id=string;
	personn.gender=string3;
	 personn.age=string4;
	 personn.FinalDiagnosis=string7;
	 personn.company_number=string9;
	personn.GeneralDoctor=string8;
	personn.phone_number=string5;

}
@Then("the user  with id {string} , name {string},phone number {string},gender\"female\", ,age {string},D.O.A {string},Final Diagnosis\"cough \",General Doctor\"dima awda\" is registered in the system")
public void the_user_with_id_name_phone_number_gender_female_age_d_o_a_final_diagnosis_cough_general_doctor_dima_awda_is_registered_in_the_system(String string, String string2, String string3, String string4, String string5) {
    
}




@When("the patient with id {string} register")
public void the_patient_with_id_register(String string) {
	

	personn.added=true;
}



@Given("that the admin is not logged in")
public void that_the_admin_is_not_logged_in() {
	case1.loginflag=false;
	personn.added=false;
	 er.error="Administrator login required";
}



@Given("ther is a patient with  id {string} , name {string},gender {string}, ,age {string},phone number {string},D.O.A  {string},Final Diagnosis {string},General Doctor {string},company number {string}")
public void ther_is_a_patient_with_id_name_gender_age_phone_number_d_o_a_final_diagnosis_general_doctor_company_number(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
	personn.id=string;
	personn.name=string2;
	personn.gender=string3;
	 personn.age=string4;
	 personn.FinalDiagnosis=string7;
	 personn.company_number=string9;
	personn.GeneralDoctor=string8;
	personn.phone_number=string5;

}




@Given("ther is a patient withid {string} , name {string},gender {string}, ,age {string},phone number {string},D.O.A  {string},Final Diagnosis {string},General Doctor {string},company number {string}")
public void ther_is_a_patient_withid_name_gender_age_phone_number_d_o_a_final_diagnosis_general_doctor_company_number(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
	personn.id=string;
	personn.gender=string3;
	 personn.age=string4;
	 personn.FinalDiagnosis=string7;
	 personn.company_number=string9;
	personn.GeneralDoctor=string8;
	personn.phone_number=string5;

}




        @Then("error message {string} is given")
            public void error_message_is_given(String string) {
        	assertEquals(er.error,string);
	         
           }

@Given("that the admin is logged in and the patient is already registered")
public void that_the_admin_is_logged_in_and_the_patient_is_already_registered() {
	case1.loginflag=true;
	personn.added=false;
	 er.error="This patient is already registered";
}
}








