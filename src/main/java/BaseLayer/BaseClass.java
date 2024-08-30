package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass()
	{
		 prop = new Properties();
		String path=System.getProperty("user.dir")+"//src//main//java//Configuration//Config.properties";
		
		try
		{
			FileInputStream fis= new FileInputStream(path);
			prop.load(fis);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void initialization()
	{
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
	}

}
