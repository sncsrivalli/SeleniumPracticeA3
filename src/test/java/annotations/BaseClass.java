package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void suiteConfig() {
		Reporter.log("BeforeSuite", true);
	}
	
	@BeforeTest
	public void testConfig() {
		Reporter.log("BeforeTest", true);
	}
	
	@BeforeClass
	public void classConfig() {
		Reporter.log("BeforeClass", true);
	}
	
	@BeforeMethod
	public void methodConfig() {
		Reporter.log("BeforeMethod", true);
	}
	
	@AfterMethod
	public void methodTearDown() {
		Reporter.log("AfterMethod", true);
	}
	
	@AfterClass
	public void classTearDown() {
		Reporter.log("AfterClass", true);
	}
	
	@AfterTest
	public void testTearDown() {
		Reporter.log("AfterTest", true);
	}
	
	@AfterSuite
	public void suiteTearDown() {
		Reporter.log("AfterSuite", true);
	}
}
