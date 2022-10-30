package fall2020project;

import java.util.ArrayList;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class convert {
	
	String datebooked;
	String Id;
	
	@Given("the user came on time")
	public void the_user_came_on_time() {
		case1.loginflag=true;
	}

	@Then("the appointment convert to visit")
	public void the_appointment_convert_to_visit() {
		ArrayList<String> visits = new ArrayList<String>();
		System.out.println("Enter patient id   ");
		Scanner sc = new Scanner(System.in);
		  String Id = sc.nextLine();
		System.out.println("if the patient came on time enter true , else enter false  ");
		String visitpatient = sc.nextLine(); 
		if(visitpatient.equals(true)) {
			visits.add(datebooked);
		}
	}
}
