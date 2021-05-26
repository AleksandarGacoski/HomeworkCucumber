package StepsDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	WebDriver driver;
	LoginPage objLogin;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		objLogin = new LoginPage(driver);
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Precondition");
		driver.navigate().to("http://automationpractice.com/index.php");
		objLogin.clickSignIn();
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("Some action");

		objLogin.enterValidUsername("fasdfa@gmail.com");
		objLogin.enterValidPass("Testing123");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Another action");
		objLogin.clickSignInButton();
	}

	@Then("user is navigated on login page")
	public void user_is_navigated_on_login_page() {
		System.out.println("Validation");
	
		driver.getPageSource().contains("Welcome to your account.");
	}

}
