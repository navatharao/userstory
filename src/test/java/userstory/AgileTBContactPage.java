package userstory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileTBContactPage {

	WebDriver driver;

	public AgileTBContactPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="mobile")
	private WebElement phone;
	@FindBy(id="office")
	private WebElement office;
	@FindBy(id="subject")
	private WebElement subject;
	@FindBy(id="message")
	private WebElement message;
	@FindBy(id="submit")
	private WebElement submit;
	
	public WebElement name()
	{
		return name;
	}
	public WebElement email()
	{
		return email;
	}
	public WebElement phone()
	{
		return phone;
	}
	public WebElement office()
	{
		return office;
	}
	public WebElement subject()
	{
		return subject;
	}
	public WebElement message()
	{
		return message;
	}
	public WebElement submit()
	{
		return submit;
	}
}
