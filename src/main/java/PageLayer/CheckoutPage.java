package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class CheckoutPage extends BaseClass{
	
	@FindBy(id="finish")
	private WebElement finish;
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void checkOutFunctionality()
	{
		finish.click();
	}
}
