package fall2020project;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class update extends appointment {
	String datebooked;
	String Id;
	errorhandling er;
	appointment aapp;
	update(){
		String Id= id;
		String date= datebooked;
		boolean visit ;}
	
	@Given("The user wants to update an appointment and he is not logged in")
	public void the_user_wants_to_update_an_appointment_and_he_is_not_logged_in() {
		case1.loginflag=false;
		aapp.added=false;
		 er.error="Administrator login required";
	}

	@Given("The user wants to update an appointment and he is  logged in")
	public void the_user_wants_to_update_an_appointment_and_he_is_logged_in() {
		case1.loginflag=true;
	}

	@Then("update this appointment and the old appointment is available")
	public void update_this_appointment_and_the_old_appointment_is_available() {
		System.out.println("if you wants to update your appointment , Enter your ID , and The old date");
		Scanner sc = new Scanner(System.in);
		  String id = sc.nextLine();
		String date = sc.nextLine(); 
		while(date.equals(datebooked)) {
			System.out.println(" Enter The date to be booked ");
			String newdate = sc.nextLine();
			datebooked= newdate;
	}

}}
