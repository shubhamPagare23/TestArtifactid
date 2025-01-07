//package yahooFunctionalities;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//import pages.AddingCustomerPage_PF;
//import pages.AddingCustomerPage_POM;
//
//public class AddAccount_PF {
//
//	WebDriver driver = null;
//	AddingCustomerPage_PF pf;
//
//	@Before
//	public void setUp() {
//		String userDir = System.getProperty("user.dir");
//		System.out.println(userDir);
//		System.setProperty("webdriver.chrome.driver", userDir + "/src/main/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
//
//	}
//
//	@Given("User is on bank manager add account option")
//	public void user_is_on_bank_manager_add_account_option() {
//
//		driver.findElement(By.xpath("//*[@ng-click='manager()']")).click();
//		driver.findElement(By.xpath("//*[@ng-click='addCust()']")).click();
//
//	}
//
//	@When("^User inputs (.*) and (.*) and Post Code in the website$")
//	public void user_inputs_f_name1_and_l_name1_and_in_the_website(String firstName, String lastname) {
//        
//		pf = new AddingCustomerPage_PF(driver);
//		pf.addingCustomer_PF(firstName, lastname);
//		
//	}
//
//	@Then("user account number should be visible in the ui")
//	public void user_account_number_should_be_visible_in_the_ui() throws Exception {
//
//		String userId = driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
//		System.out.println("Alert Accepted");
//		Thread.sleep(3000);
//		System.out.println(userId);
//		
//	}
//
//	@After
//	public void tearDown() throws Exception {
//
//		//Thread.sleep(30000);
//		driver.quit();
//
//	}
//
//
//}
