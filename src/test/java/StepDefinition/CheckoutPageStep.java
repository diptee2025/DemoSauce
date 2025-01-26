package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.CheckoutPage;
import io.cucumber.java.en.When;

public class CheckoutPageStep extends BaseClass{
	
	@When("user should click on finish button")
	public void user_should_click_on_finish_button() {
	   CheckoutPage checkout = new CheckoutPage();
	   checkout.checkOutFunctionality();
	}


}
