package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PersonalDetailsPage extends BaseClass{
	
	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastname;
	
	@FindBy(name = "postalCode")
	private WebElement postalcode;
	
	@FindBy(name = "continue")
	private WebElement continueButton;
	

	public PersonalDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void personaldetailsfunctionality(String FirstName,String LastName, String PostalCode)
	{
		firstname.sendKeys(FirstName);
		lastname.sendKeys(LastName);
		postalcode.sendKeys(PostalCode);
	}
	
	public void continueButton()
	{
		continueButton.click();
	}
}
