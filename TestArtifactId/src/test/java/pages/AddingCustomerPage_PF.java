//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class AddingCustomerPage_PF {
//
//	WebDriver driver;
//	
//	@FindBy (xpath="//*[@placeholder='First Name']")
//	WebElement fname ;
//	
//	@FindBy (xpath="//*[@placeholder='Last Name']")
//	WebElement lname;
//	
//	@FindBy(xpath="//*[@placeholder='Post Code']")
//	WebElement postcode;
//	
//	@FindBy (xpath="//*[text()='Add Customer']")
//	WebElement addcust;
//	
//	public AddingCustomerPage_PF(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void addingCustomer_PF(String firstName, String lastname) {
//		
//		fname.sendKeys(firstName);
//		lname.sendKeys(lastname);
//		postcode.sendKeys("78965");
//		addcust.click();
//	}
//	
//}
