package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Username=By.xpath("//input[@id='login1']");
	By Password=By.xpath("//input[@id='password']");
	By go = By.name("proceed");
	By Home = By.linkText("Home");
	
	public WebElement emailid() {
		return driver.findElement(Username);
	}
	public WebElement Password() {
		return driver.findElement(Password);
}
	public WebElement gobutton() {
		return driver.findElement(go);
		
		}
	
	public WebElement Home() {
		return driver.findElement(Home);
}
}