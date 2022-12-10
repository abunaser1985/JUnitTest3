import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ToggleAll {
WebDriver driver;
	
By ToggleAllcheckedBox = By.cssSelector(".controls > input:nth-child(3)");
By AllcheckedBox = By.cssSelector("#todos-content > form:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > input:nth-child(2)");	

@Before
    public void launch() {
		
		System.setProperty("webdriver.gecko.marionett", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/102/#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	}

