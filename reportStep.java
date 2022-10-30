package fall2020project;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class reportStep {
	
	report item;
	errorhandling er; 
	
	public reportStep(report item,errorhandling e ) {
		this.item=item;
		er=e;}
	
	@Given("these are the data")
	public void these_are_the_data() {
	  
	}

	@Given("the admin is logged in")
	public void the_admin_is_logged_in() {
		case1.loginflag=true;
	}

	@Given("there is a report with name {string} , number {string} and percentage of increase {string}")
	public void there_is_a_report_with_name_number_and_percentage_of_increase(String string, String string2, String string3) {
		item.name=string;
		item.id=string2;
		item.percentage_of_increase=string3;
	}

	@When("the report is created to the clinic")
	public void the_report_is_created_to_the_clinic() {
		item.added=true;
	}

	@Then("the report with name {string} , number {string} and percentage of increase {string} is contained in the clinic")
	public void the_report_with_name_number_and_percentage_of_increase_is_contained_in_the_clinic(String string, String string2, String string3) {
		assertTrue(item.added);
	}

	@Given("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
		case1.loginflag=false;
		item.added=false;
		 er.error="Administrator login required";
	}

}
