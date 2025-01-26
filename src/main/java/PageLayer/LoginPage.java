package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name = "user-name")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "login-button")
	private WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void usernameAndPasswordFunctionality(String Username,String Password)
	{
		username.sendKeys(Username);
		
		password.sendKeys(Password);
	}
	
	public void loginButtonFunctionality()
	{
		loginButton.click();
	}

}
