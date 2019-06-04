package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	public static WebDriver createChrome() {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Bruno Rafael\\git\\TesteSlack\\TesteSlack\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://abbratech.slack.com/");
		
		return driver;
	}

}
