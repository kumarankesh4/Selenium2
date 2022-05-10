import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartProduct {
	@Test
	public void flipkartProduct() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace\\Selenium2\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");
	WebElement email=driver.findElement(By.xpath("//*[text()='Enter Email/Mobile number']/ancestor::div[1]/input"));
	WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
	WebElement login_btn=driver.findElement(By.xpath("//div[@class='_1D1L_j']//span[text()='Login']/ancestor::button"));
	
	email.sendKeys("7249811023");
	pwd.sendKeys("Power1993#");
	login_btn.click();Thread.sleep(5000);
	/*
	 * WebElement loggeduser=
	 * driver.findElement(By.xpath("//div[@class='exehdJ' and text()='Kumar ']"));
	 * Actions act= new Actions(driver); act.moveToElement(loggeduser).perform();
	 * WebElement myprof=driver.findElement(By.xpath("//div[text()='My Profile']"));
	 * myprof.click();
	 */
	WebElement searchBox= driver.findElement(By.xpath("//*[@name='q']"));
	searchBox.sendKeys("Mobiles");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='in Mobiles']")));
	driver.findElement(By.xpath("//div[text()='in Mobiles']")).click();
	Select s= new Select(driver.findElement(By.xpath("//*[@class='_2b0bUo']/div[3]/select")));
	s.selectByVisibleText("₹7000");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	System.out.println(driver.getTitle());
	String parentW=driver.getWindowHandle();
	
	WebElement mi=driver.findElement( By.xpath("//*[@class='_3FPh42']//*[text()='Mi']/preceding-sibling::div"));
	js.executeScript("arguments[0].click()", mi);
	WebElement phone=driver.findElement(By.xpath("//div[@class='_3pLy-c row']/div[1]/div[contains(text(),'Metal')]"));
	System.out.println(driver.getTitle());
	
	js.executeScript("arguments[0].click()", phone);
	
	Set<String> windows= driver.getWindowHandles();
	System.out.println(driver.getTitle());
	Iterator<String> itr= windows.iterator();
	while(itr.hasNext())
	{
		String child=itr.next();
		if(!parentW.contentEquals(child))
		{
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
		}
		
	}
	
	
	  for(String winHandle : driver.getWindowHandles()){
	 driver.switchTo().window(winHandle); }
	  
	  WebElement
	  addtoCartButton=driver.findElement(By.xpath("//*[text()='BUY NOW']"));
	  
	
	 Thread.sleep(2000); List<WebElement>
	 al=driver.findElements(By.xpath("//div[@class='_24_Dny']"));
	 Thread.sleep(2000);
//	 
//	  for(WebElement el:al) { 
//		  
//	 js.executeScript("arguments[0].click()", el); }
//	 
      // Javascript executor
	
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(2000);
	  Assert.assertTrue(addtoCartButton.isDisplayed());
      
	  try {
		  addtoCartButton.click();
	  }
	  catch(Exception e)
	  {
		  js.executeScript("arguments[0].click()", addtoCartButton);
	  }
	  
		
	  
	 
	 
	
}
}