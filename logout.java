package fall2020project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.logging.*;
public class logout {
	


	

		Logger logger
	    = Logger.getLogger(logout.class.getName());
	Data admin =new Data();
	@Given("admin is logged in")
	public void admin_is_logged_in() {
	admin.setLogged(true);
	}


	@When("the admin logs out")
	public void the_admin_logs_out() {
	



	admin.logOut();
	}

	@Then("remove admin authorities")
	public void remove_admin_authorities() {
	assertFalse(admin.isLogged());
	logger.log(Level.INFO,"logged Out");
	}
		


	
	



		
	}


