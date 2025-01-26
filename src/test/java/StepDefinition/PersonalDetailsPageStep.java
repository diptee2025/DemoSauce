package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.PersonalDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailsPageStep  extends BaseClass{
	
	private static PersonalDetailsPage personal;
	
	@When("user enter personal details firstname {string} and lastname {string} and postal code {string}")
	public void user_enter_personal_details_firstname_and_lastname_and_postal_code(String fname, String lname, String pcode) {
	    personal = new PersonalDetailsPage();
	    personal.personaldetailsfunctionality(fname, lname, pcode);
	}
	@Then("user click on continue button")
	public void user_click_on_continue_button() {
	    personal.continueButton();
	}

}
