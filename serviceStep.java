package fall2020project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class serviceStep {
	service item;
	errorhandling er; 
	
	public serviceStep(service item,errorhandling e ) {
		this.item=item;
		er=e;
		
	}
	
@Given("there is a service with name {string} and price {string}")
public void there_is_a_service_with_name_and_price(String string, String string2) {
	item.name=string;
	item.price=string2;
}

@When("the service is added to the clinic")
public void the_service_is_added_to_the_clinic() {
	item.added=true;
}

@Then("the service with name {string} and price {string} is contained in the clinic")
public void the_service_with_name_and_price_is_contained_in_the_clinic(String string, String string2) {
	assertTrue(item.added);
}

}
