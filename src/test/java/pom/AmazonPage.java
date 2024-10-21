package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

	//Declaration
	@FindBy(id = "nav-logo-sprites")
	private WebElement logo;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchTF;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	
	//Initialization
	public AmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLogo() {
		return logo;
	}
	
	public void setSearchTF(String data) {
		searchTF.sendKeys(data);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
}
