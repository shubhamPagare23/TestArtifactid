package background_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ParaBank_Background_PF;

public class BackGroundDemo {
	
	WebDriver driver;
	ParaBank_Background_PF parabankPF;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");

		
	 
	}

	@When("user inputs name and password")
	public void user_inputs_name_and_password() {
		parabankPF = new ParaBank_Background_PF(driver);
		
		parabankPF.doLogin();
	}

	@Then("user should be directed to home page")
	public void user_should_be_directed_to_home_page() {
		
		
	}
	
	
	@Given("user is logged in")
	public void user_is_logged_in() {
	}

	@When("user is on home page")
	public void user_is_on_home_page() {
	}

	@Then("log out button is diplayed")
	public void log_out_button_is_diplayed() {
	}

	@When("User clicks on request loan option")
	public void user_clicks_on_request_loan_option() {
		System.out.println("TEST GIT ACVF345V");
	}

	@Then("Apply for a loan should be visible")
	public void apply_for_a_loan_should_be_visible() {
	}
	

}
