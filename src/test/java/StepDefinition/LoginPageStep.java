package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	private static LoginPage loginpage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   BaseClass.initialization();
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String Username, String Password) {
	   loginpage = new LoginPage();
	   loginpage.usernameAndPasswordFunctionality(Username, Password);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	   loginpage.loginButtonFunctionality();
	}

}
