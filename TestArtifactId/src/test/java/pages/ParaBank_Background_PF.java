package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBank_Background_PF {
	
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@name='username']")
	WebElement UserName ;
	
	@FindBy (xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy (xpath="//*[@type='submit']")
	WebElement login;
//	
//	@FindBy (xpath="//*[text()='Request Loan']")
//	WebElement loan;
//	
//	@FindBy (xpath="//*[contains(text(), 'Apply for a Loan')]")
//	WebElement applyLoanText;
	
	
	public ParaBank_Background_PF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin() {
		UserName.sendKeys("test");
		password.sendKeys("test");
		login.click();
	}
	
	
	
	
	
	

}
