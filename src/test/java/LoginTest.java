
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.LoginPage;
import Utilities.DataTables;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void initializeDriver() throws IOException
	{
		String dir=System.getProperty("user.dir");
	
		System.out.println(dir);
		System.setProperty("webdriver.chrome.driver", dir+"\\src\\main\\java\\Resources\\chromedriver.exe");
		driver= new ChromeDriver();
		Properties p= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\Selenium2\\src\\main\\java\\Resources\\Property.file");
		p.load(fis);
		
		
		driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	}
@Test
public void loginTest() throws Exception
{
	LandingPage l= new LandingPage(driver);
	l.clickOnProfile();
	LoginPage lp= new LoginPage(driver);
	lp.clickLogin();
	DataTables dt= new DataTables();
	dt.dataTable();
	
}
}