package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.IHookable;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\c files\\git\\CucumberDemoProject\\CucumberPro\\src\\main\\java\\configfile\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

	public static void parameter() throws InterruptedException {
		String browser = prop.getProperty("browser");
		
		  if (browser.equalsIgnoreCase("chrome"))
	        {
       System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver\\chromedriver.exe");
	       driver = new ChromeDriver();

	        }
	        else if (browser.equalsIgnoreCase("ie"))
	        {

	        System.setProperty("webdriver.ie.driver", ".\\lib\\IEdriver\\IEDriverServer.exe");
	        driver = new InternetExplorerDriver();
	        }
	        else if (browser.equalsIgnoreCase("firefox"))
	        {
	        System.setProperty("webdriver.gecko.driver", ".\\lib\\firefoxdriver\\geckodriver.exe");
	        driver = new FirefoxDriver();
	        }
		 
	driver.manage().deleteAllCookies();
   driver.manage().window().maximize();
	
   driver.get(prop.getProperty("url"));
   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
   
   public static void userlogin(String username, String password) throws InterruptedException {
   driver.findElement(By.name("username")).sendKeys(username);
   driver.findElement(By.name("password")).sendKeys(password);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@type='submit']")).click();
   }
   
	/*driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	*/
	
	
	
	}


