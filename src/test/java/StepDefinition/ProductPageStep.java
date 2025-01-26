package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageStep extends BaseClass{
	
	ProductPage product;
	
	@When("user should sort the product")
	public void user_should_sort_the_product() {
	    product = new ProductPage();
	    product.sortfunctionality();
	}
	@Then("user should select product")
	public void user_should_select_product() {
	   product.backpackfunctionality();
	}
	@Then("user should click on shopping cart button")
	public void user_should_click_on_shopping_cart_button() {
	    product.containerfunctionality();
	}

}
