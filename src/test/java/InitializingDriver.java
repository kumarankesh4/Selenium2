import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InitializingDriver {
	@Test
	public void  initializeDriver() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace\\Selenium2\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		WebElement email=driver.findElement(By.xpath("//*[text()='Enter Email/Mobile number']/ancestor::div[1]/input"));
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login_btn=driver.findElement(By.xpath("//div[@class='_1D1L_j']//span[text()='Login']/ancestor::button"));
		
		email.sendKeys("7249811023");
		pwd.sendKeys("Power1993#");
		login_btn.click();Thread.sleep(5000);
		WebElement loggeduser= driver.findElement(By.xpath("//div[@class='exehdJ' and text()='Kumar ']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(loggeduser).perform();
		WebElement myprof=driver.findElement(By.xpath("//div[text()='My Profile']"));
		myprof.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement logout=driver.findElement(By.xpath("//*[text()='Logout']/parent::div"));
		wait.until(ExpectedConditions.visibilityOfAllElements(logout));
		logout.click();
		
		
		
		
	
	}

	

}
