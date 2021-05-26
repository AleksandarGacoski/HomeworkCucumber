package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	WebDriver driver;
	
	//Creating account locators
	By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");	
	By emailCreate = By.id("email_create");
	By submitButton = By.id("SubmitCreate");
	By radio2 = By.id("id_gender2");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By pass = By.id("passwd");
	By address = By.id("address1");
	By city = By.id("city");
	By postcode = By.xpath("//input[@id='postcode']");
    By phoneMobile = By.xpath("//input[@id='phone_mobile']");
	By registerButton = By.xpath(" //*[@id=\"submitAccount\"]/span");
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void clickSignIn()
	{
		driver.findElement(signIn).click();
	}
	

	public void enterRandomEmail()
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(emailCreate).sendKeys("useruser987678"+ randomInt +"@gmail.com");
	}
	
	public void clickSubmit()
	{
		driver.findElement(submitButton).click();
	}
	
	public void checkRadio()
	{
		driver.findElement(radio2).click();
	}
	
	public void enterFirstName(String name)
	{
		driver.findElement(firstName).sendKeys(name);
	}
	
	public void enterLastName(String surName)
	{
		driver.findElement(lastName).sendKeys(surName);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	
	public void choseDay(int den)
	{
		Select days = new Select(driver.findElement(By.name("days")));
		days.selectByIndex(den);
		
	}
	
	public void choseMonth(int mesec)
	{
		Select month = new Select(driver.findElement(By.name("months")));
		month.selectByIndex(mesec);
		
	}
	
	public void choseYear(int godina)
	{
		Select year = new Select(driver.findElement(By.name("years")));
		year.selectByIndex(godina);
		
	}
	
	public void enterAddress(String adresata)
	{
		driver.findElement(address).sendKeys(adresata);
	}
	
	public void enterCity(String gradot)
	{
		driver.findElement(city).sendKeys(gradot);
	}
	
	public void choseState(int drzava)
	{
		Select state = new Select(driver.findElement(By.name("id_state")));
		state.selectByIndex(drzava);
		
	}
	public void enterPostcode(String postenski)
	{
		driver.findElement(postcode).sendKeys(postenski);
	}
	
	public void enterPhone(String telephone)
	{
		driver.findElement(phoneMobile).sendKeys(telephone);
	}
	
	public void clickRegisterButton()
	{
		driver.findElement(registerButton).click();
	}
	
}
