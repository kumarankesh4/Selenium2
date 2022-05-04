import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakingScreenshot {
	 WebDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 //driver=InitializingDriver.initializeDriver();
	 }
	@Test
	public void ssc() throws IOException
	{
		Date date= new Date();
		Format formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
		driver.get("https://fb.com");
		TakesScreenshot tk= (TakesScreenshot) driver;
		File f= new File("C:\\Users\\manis\\eclipse-workspace\\Selenium2\\"+formatter.format(date)+"ss.png");
		File src=tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, f);
		
	}

}
