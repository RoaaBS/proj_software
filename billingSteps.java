package fall2020project;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class billingSteps {
	

		
		billing item;
		errorhandling er; 
		
		public billingSteps(billing item,errorhandling e ) {
			this.item=item;
			er=e;
			
		}
		
	//	@Given("that the administrator is logged in")
	//	public void that_the_administrator_is_logged_in() {
	//		case1.loginflag=true;
	//	}
	

		@Given("there is a billing with patient_name {string} , last_name is {string} , service is {string} , price is {string} , D_O_A is {string} and time is {string}")
		public void there_is_a_billing_with_patient_name_last_name_is_service_is_price_is_d_o_a_is_and_time_is(String string, String string2, String string3, String string4, String string5, String string6) {
		    // Write code here that turns the phrase above into concrete actions
		  
			item.patient_name=string;
			item.last_name=string2;
			item.service=string3;
			item.price=string4;
			item.D_O_A= string5;
			item.time=string6;
		}
		@When("the billing is added in the clinic")
		public void the_billing_is_added_in_the_clinic() {
			item.added=true;
		}
		@Then("the billing with patient_name {string} , last_name is {string} , service is {string} , price is {string} , D_O_A is {string} and time is {string} is contained in the clinic")
		public void the_billing_with_patient_name_last_name_is_service_is_price_is_d_o_a_is_and_the_time_is_is_contained_in_the_clinic(String patient_name, String last_name, String service, String price, String D_O_A, String time) {
			assertTrue(item.added);
		}
	//	@Given("that the administrator is not logged in")
	//	public void that_the_administrator_is_not_logged_in() {
	//		case1.loginflag=false;
	//		item.added=false;
	//		 er.error="Administrator login required";
	//	}



		

	
	


		
	}


