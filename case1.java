package fall2020project;
import static org.junit.Assert.assertTrue;


import io.cucumber.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class case1 {
	Data c;
	
	
	public case1()
	{
		c=new Data();
	}
	static boolean loginflag;
	public  case1( Data r) {
		c=new Data(r);
	}
	@Given("The user is not logged in")
	public void the_user_is_not_logged_in() {
		loginflag=false;
	    
	}

	@Given("the password is {string}")
	public void the_password_is(String st) {
		
		
		c.password=st;
		if( c.checkpass(st)==1) {
			loginflag=true;
		}
		if( c.checkpass(st)==0) {
			loginflag=false;
		}
		 
	    
	}

	@Given("the email is {string}")
	public void the_email_is(String string) {
		if( c.checkemail(string)==1) {
			loginflag=true;
		}
		if( c.checkemail(string)==0) {
			loginflag=false;
		}
	    
	}

	@Then("the user login succeeds")
	public void the_user_login_succeeds() {
		 assertTrue(loginflag);
	    
	}

	@Then("the user is logged in")
	public void the_user_is_logged_in() {
		 assertTrue(loginflag);
	  
	}

	@Then("the user login fails")
	public void the_user_login_fails() {
		 assertTrue(!loginflag);
	   
	}

	@Then("thw user is not logged in")
	public void thw_user_is_not_logged_in() {
		 assertTrue(!loginflag);
	 
	}
		}