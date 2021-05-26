package checkoutBank;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankTest {

	WebDriver driver;
	CheckoutLocators objCheckoutBank = new CheckoutLocators(driver);

	@Before
	public void openAutomation() throws Exception { 
		driver = new ChromeDriver();
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	@After
	public void quitAutomation() throws Exception { 
	
		driver.close();
	}
	
	@Test
	public void checkoutByBank() {
		objCheckoutBank.loginOnPage("fasdfa@gmail.com", "Testing123");
		objCheckoutBank.clickWomenCategory();
		objCheckoutBank.clickFirstDress();
		objCheckoutBank.clickAddToCart();
		objCheckoutBank.clickProceedToCheckout();
		objCheckoutBank.clickProceedToCheckoutInCart();
		objCheckoutBank.clickProceedToCheckoutInAddresses();
		objCheckoutBank.clickCheckBox();
		objCheckoutBank.clickProceedToCheckoutInShipping();
		objCheckoutBank.clickPayByBank();
		objCheckoutBank.clickIConfirm();
		
	}
	
	
	
	
	
}
