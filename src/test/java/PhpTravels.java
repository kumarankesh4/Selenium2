import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravels {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace\\Selenium2\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://phptravels.com/demo/");
	WebElement loginButton=driver.findElement(By.xpath("//*[text()='Login']"));
	loginButton.click();
	Set<String> windows= driver.getWindowHandles();
	Iterator<String> itr= windows.iterator();
	String parent=itr.next();
	String child=itr.next();
	driver.switchTo().window(child);
	WebDriverWait wait = new WebDriverWait(driver,10);
	WebElement registerButton=driver.findElement(By.xpath("//body//*[text()='Register']"));
	wait.until(ExpectedConditions.elementToBeClickable(registerButton));
	
	registerButton.click();
	driver.findElement(By.id("inputFirstName")).sendKeys("kumar");
	driver.findElement(By.id("inputLastName")).sendKeys("ankesh");
	driver.findElement(By.id("inputEmail")).sendKeys("kumarankesh482@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Power1993#");
	driver.findElement(By.id("passwordr")).sendKeys("Power1993#");
	driver.findElement(By.id("company")).sendKeys("PSL");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//new comment by Ankesh
	//new comment just now Ankesh
	
	
}
}
