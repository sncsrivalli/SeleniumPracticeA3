package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Declaration
	@FindBy(xpath = "//h3[text()='Login']")
	private WebElement pageHeader;

	@FindBy(id = "email")
	private WebElement usernameTF;

	@FindBy(id = "password")
	private WebElement passwordTF;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCB;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotPWDLink;

	@FindBy(id = "last")
	private WebElement loginButton;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void setUsername(String un) {
		usernameTF.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		passwordTF.sendKeys(pwd);
	}
	
	public void clickKeepMeLoggedInCB() {
		keepMeLoggedInCB.click();
	}
	
	public void clickForgotPWDLink() {
		forgotPWDLink.click();
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}
