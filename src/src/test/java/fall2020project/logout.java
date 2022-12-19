package fall2020project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.logging.*;
public class logout {
	boolean t;

		Logger logger
	    = Logger.getLogger(logout.class.getName());
	Data admin =new Data();
	@Given("Admin already log in")
	public void admin_already_log_in() {
		admin.setLogged(true);
	}
	
	


	@When("{string} select to log out")
	public void select_to_log_out(String string) {
		admin.logOut();
		}
	
	@Then("log out done")
	public void log_out_done() {
		assertFalse(admin.isLogged());
		logger.log(Level.INFO,"logged Out");
	}

	
	



		
	}


