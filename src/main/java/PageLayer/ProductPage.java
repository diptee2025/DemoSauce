package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ProductPage extends BaseClass{

	@FindBy(xpath="//select [@class='product_sort_container']")
	
	private WebElement sort;	
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")

	private WebElement backpack;
	
	@FindBy(id="shopping_cart_container")
	private WebElement conatiner;
	
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void sortfunctionality() {
		sort.click();
	}
	
	public void backpackfunctionality() {
		backpack.click();
	}
	
	public void containerfunctionality() {
		conatiner.click();
	}
}
