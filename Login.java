package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.RediffHomaPage;
import ObjectRepository.RediffLoginpage;

public class Login { 	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\software\\work\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage login = new RediffLoginpage(driver);
           login.emailid().sendKeys("hello.com");
           
           login.Password().sendKeys("helom");
           login.gobutton().click();
           login.Home().click();
	

	RediffHomaPage LOgh = new RediffHomaPage(driver);
	LOgh.Searches().sendKeys("rediiff");
	LOgh.SearchButton().click();
}
	
	public void main () {
		WebDriver driver = new ChromeDriver();
		RediffHomaPage LOgh = new RediffHomaPage(driver);
		LOgh.Searches().sendKeys("rediiff");
		LOgh.SearchButton().click();
	
	}
}