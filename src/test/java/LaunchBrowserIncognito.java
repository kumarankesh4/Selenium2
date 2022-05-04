import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowserIncognito {
public static void main(String[] args) {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setBrowserName("chrome");

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace\\Selenium2\\Drivers\\chromedriver.exe");
	
	ChromeOptions o= new ChromeOptions();
    // add Incognito parameter
    o.addArguments("--incognito");
    // DesiredCapabilities object
   
    //set capability to browser
    capabilities.setCapability(ChromeOptions.CAPABILITY, o);
    WebDriver driver = new ChromeDriver(o);
    driver.get("https://www.tutorialspoint.com/index.htm ");
}
}
