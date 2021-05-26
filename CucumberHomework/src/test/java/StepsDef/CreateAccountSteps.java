package StepsDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccountPage;

public class CreateAccountSteps {
	WebDriver driver = new ChromeDriver();
	CreateAccountPage objCreate;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		objCreate = new CreateAccountPage(driver);
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Precondition");
		driver.navigate().to("http://automationpractice.com/index.php");
		objCreate.clickSignIn();
	}

	@When("user populates all mandatory fields")
	public void user_populates_all_mandatory_fields() {
		System.out.println("actions populating");
		
		
		objCreate.enterRandomEmail();
		objCreate.clickSubmit();
		objCreate.checkRadio();
		objCreate.enterFirstName("Aleksandar");
		objCreate.enterLastName("Gacoski");
		objCreate.enterPassword("Testing123");
		objCreate.choseDay(1);
		objCreate.choseMonth(5);
		objCreate.choseYear(6);
		objCreate.enterAddress("UlicaBrestova13");
		objCreate.enterCity("Bitola");
		objCreate.choseState(1);
		objCreate.enterPostcode("12345");
		objCreate.enterPhone("879838383");
		
	}

	@And("clicks register button")
	public void clicks_register_button() {
		System.out.println("click register");
		objCreate.clickRegisterButton();
	}

	@Then("user validates the he is on My account page")
	public void user_validates_the_he_is_on_my_account_page() {
		System.out.println("validation");
		driver.getPageSource().contains("Welcome to your account.");
	}
}
