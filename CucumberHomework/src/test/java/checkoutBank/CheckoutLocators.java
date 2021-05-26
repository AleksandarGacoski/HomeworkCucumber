package checkoutBank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import pages.LoginPage;


public class CheckoutLocators {

	WebDriver driver;
	
	By WomenButton = By.cssSelector(".sfHover > .sf-with-ul");
	By firstDress = By.cssSelector(".ajax_block_product:nth-child(1) .button:nth-child(1) > span");
	By addToCartButton = By.cssSelector(".exclusive > span");
	By proceedButton = By.cssSelector(".button-medium > span");
	By cartProceedButton = By.cssSelector(".standard-checkout > span");
	By addressesProceedButton = By.cssSelector(".button:nth-child(4) > span");
	By checkBox = By.cssSelector("label");
	By shippingProceedButton = By.cssSelector(".standard-checkout > span");
	By payByBankButton = By.cssSelector(".bankwire > span");
	By IConfirmMyOrderButton = By.cssSelector("#cart_navigation span");
	
	By secondDress = By.cssSelector(".ajax_block_product:nth-child(2) .button:nth-child(1) > span");
	By closePDP = By.cssSelector(".cross");
	By proceedSecond = By.cssSelector(".button-medium:nth-child(2) > span");
	By payByCheckButon = By.linkText("Pay by check (order processing will be longer)");
	
	
	// Login locators  
	By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By loginEmail = By.name("email");
	By loginPass = By.name("passwd");
	By signInButton = By.name("SubmitLogin");
	
	
	public CheckoutLocators(WebDriver driver) {
		this.driver = driver;
		
	}
	// Full login
	public void loginOnPage(String username, String password) {
		driver.findElement(signIn).click();
		driver.findElement(loginEmail).sendKeys(username);
		driver.findElement(loginPass).sendKeys(password);
		driver.findElement(signInButton).click();
		}
	
	public void clickWomenCategory() {
		driver.findElement(WomenButton).click();
	}
	
	public void clickFirstDress() {
		driver.findElement(firstDress).click();
	}
	
	public void clickAddToCart() {
		driver.findElement(addToCartButton).click();
	}
	
	public void clickProceedToCheckout() {
		driver.findElement(proceedButton).click();
	}
	
	public void clickProceedToCheckoutInCart() {
		driver.findElement(cartProceedButton).click();
	}
	public void clickProceedToCheckoutInAddresses() {
		driver.findElement(addressesProceedButton).click();
	}
	
	public void clickCheckBox() {
		driver.findElement(checkBox).click();
	}
	
	public void clickProceedToCheckoutInShipping() {
		driver.findElement(shippingProceedButton).click();
	}
	
	public void clickPayByBank() {
		driver.findElement(payByBankButton).click();
	}
	public void clickIConfirm() {
		driver.findElement(IConfirmMyOrderButton).click();
	}
	
	public void clickSecondDress() {
		driver.findElement(secondDress).click();
	}
	public void closePDPFirst() {
		driver.findElement(closePDP).click();
	}
	public void proceedSecond() {
		driver.findElement(proceedSecond).click();;
	}
	
	public void clickPayByCheck() {
		driver.findElement(payByCheckButon).click();
	}
	
	
	
}
