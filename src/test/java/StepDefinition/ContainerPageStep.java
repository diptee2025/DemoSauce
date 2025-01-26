package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.ContainerPage;
import io.cucumber.java.en.When;

public class ContainerPageStep extends BaseClass{
	
	@When("user should click on checkout button")
	public void user_should_click_on_checkout_button() {
		ContainerPage checkout = new ContainerPage();
		checkout.checkOutFunctionality();
	}


}
