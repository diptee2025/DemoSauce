package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContainerPage extends BaseClass{
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	public ContainerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkOutFunctionality()
	{
		checkout.click();
	}

}
