//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class AddingCustomerPage_POM {
//
//	WebDriver driver;
//	By first_Name_AddCust = By.xpath("//*[@placeholder='First Name']");
//	By last_Name_AddCust = By.xpath("//*[@placeholder='Last Name']");
//	By post_Code_AddCust = By.xpath("//*[@placeholder='Post Code']");
//	By add_Cust_AddCust = By.xpath("//*[text()='Add Customer']");
//	
//	
//	public AddingCustomerPage_POM(WebDriver driver){
//		this.driver=driver;
//	}
//
//	public void inputFirstName(String firstname) {
//
//		driver.findElement(first_Name_AddCust).sendKeys(firstname);
//	}
//
//	public void inputLastName(String lastname) {
//		driver.findElement(last_Name_AddCust).sendKeys(lastname);
//	}
//
//	public void inputPostCode() {
//		driver.findElement(post_Code_AddCust).sendKeys("7856");
//	}
//
//	public void hitAddCust() {
//		driver.findElement(add_Cust_AddCust).click();
//	}
//
//	public void addCustomer(String firstname, String lastname) {
//		driver.findElement(first_Name_AddCust).sendKeys(firstname);
//		driver.findElement(last_Name_AddCust).sendKeys(lastname);
//		driver.findElement(post_Code_AddCust).sendKeys("7856");
//		driver.findElement(add_Cust_AddCust).click();
//	}
//	
//	
//
//}
