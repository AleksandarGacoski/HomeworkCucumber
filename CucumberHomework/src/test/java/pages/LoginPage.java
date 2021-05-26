package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver; 
	
	// Login locators  
	By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By loginEmail = By.name("email");
	By loginPass = By.name("passwd");
	By signInButton = By.name("SubmitLogin");
	By signOutButton = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]");
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//SignIn on HomePage
	public void clickSignIn()
	{
		driver.findElement(signIn).click();
	}
	//valid username for login
	public void enterValidUsername(String username)
	{
		driver.findElement(loginEmail).sendKeys(username);
	}
	//valid password for login
	public void enterValidPass(String password)
	{
		driver.findElement(loginPass).sendKeys(password);
	}
	// SignIn on Authentication page
	public void clickSignInButton()
	{
		driver.findElement(signInButton).click();
	}
	
	// Full login
	public void loginOnPage(String username, String password) {
		driver.findElement(signIn).click();
		driver.findElement(loginEmail).sendKeys(username);
		driver.findElement(loginPass).sendKeys(password);
		driver.findElement(signInButton).click();
		
	}

}
