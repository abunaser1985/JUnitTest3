import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test1 extends ToggleAll {

	
    @Test
	public void login3() {	
    	
    	
    	driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All1767");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All2675");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All3673");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All4467");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All5555");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		
		

    	WebElement ToggleAll = driver.findElement(By.cssSelector("body > div.controls > input[type=checkbox]:nth-child(3)"));
    	ToggleAll.click();
    	WebElement RemoveButton = driver.findElement(By.cssSelector("body > div.controls > input[type=submit]:nth-child(1)"));

    	WebElement ListItememNumber = driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul"));
    	
    	if (ToggleAll.isSelected())
		
    			   { 
    		           RemoveButton.click();
		               Assert.assertNotEquals(ListItememNumber, 0);
    			       System.out.println ("When the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON:" + ListItememNumber.equals(ListItememNumber) ); 
    			   } 
    			   else 
    			   { 
    			      System.out.println("When the toggle all check box is CHECKED, all check boxes for list items are not CHECKED ON.");
    			   } 
	}
}
