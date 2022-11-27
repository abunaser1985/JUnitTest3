import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToggleAll {
WebDriver driver;
	
	@Before
    public void launch() {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
    @Test
	public void login1() {
    	
    	driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
    	driver.findElement(By.cssSelector("input[type=text]:nth-child(7)")).sendKeys("List Items");
		driver.findElement(By.cssSelector("input[type=submit]:nth-child(8)")).click();
		driver.findElement(By.cssSelector("a[title=\"Edit\"]")).click();
		driver.findElement(By.cssSelector("option:nth-child(294)")).click();
		driver.findElement(By.cssSelector("option[value=\"22\"]")).click();
		driver.findElement(By.cssSelector("select:nth-child(303) option:nth-child(12)")).click();
		driver.findElement(By.cssSelector("input[type=submit]:nth-child(300)")).click();
		driver.findElement(By.cssSelector("input[type=checkbox]:nth-child(3)")).click();
    }
    @Test
   	public void login2() {	
    
    	driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All1");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.cssSelector("input[name= \"todo[1]\"]")).click();
		driver.findElement(By.cssSelector("input[type=submit]:nth-child(1)")).click();
		
		
    }
		
    @Test
	public void login3() {	

    	driver.findElement(By.cssSelector("input[type=checkbox]:nth-child(3)")).click();
		driver.findElement(By.cssSelector("input[type=submit]:nth-child(1)")).click();
	}
}
