package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomaPage {
	
	WebDriver driver;
	public RediffHomaPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Searches= By.id("srchword");
	By SearchButton =By.className("newsrchbtn");
	
	
	public WebElement Searches() {
		return driver.findElement(Searches);
}
	public WebElement SearchButton() {
		return driver.findElement(SearchButton);
}
}