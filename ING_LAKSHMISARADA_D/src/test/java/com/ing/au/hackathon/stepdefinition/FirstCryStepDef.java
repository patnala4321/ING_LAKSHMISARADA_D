package com.ing.au.hackathon.stepdefinition;

import java.io.IOException;

import com.ing.au.hackathon.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCryStepDef extends Base{
	
	

	@Given("User Successfully Launches the FirstCry.com site")
	public void user_Successfully_Launches_the_FirstCry_com_site() throws IOException {
		lauchBrowser();
	}

	@When("perform required operations")
	public void perform_required_operations() {
	   
	}

	@Then("should capture the list of the centers")
	public void should_capture_the_list_of_the_centers() {
	   
	}




}
