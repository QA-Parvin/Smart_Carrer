package smart.usa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

public static Logger logger; // import from Apache
public static WebDriver driver;
public static Properties prop; //import from java until


public BasePage() {    //construtor

	logger = Logger.getLogger("QA Tester Farzana"); // Added logger
	PropertyConfigurator.configure("Log4j.properties");// Added logger
	try {

		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/smart/usa/config/Config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());

	} finally { // Must executed
		System.out.println("The fibrowserNamenally statement is executed file not found");
	}
}
   public static void getInitialization() {
   String browserName = prop.getProperty("browser");	
 
   if(browserName.equalsIgnoreCase("chrome")) {
	logger.info("I am a chrome browser");
	WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
}
   else if(browserName.equals("chrome")) {
	logger.info("********I am a chrome browser**********");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
   }	
    else if (browserName.equals("headless")) {
	logger.info("*******I am a headless mode chrome browser********");
String ChromeDriverPath = prop.getProperty("mac");
System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless","--disable gpu","--window--size=1920,1200",
	                     "--ignore--certificate-errors","silent");
	driver = new ChromeDriver(options);
}
   else if(browserName.equals("ie")) {
	logger.info("******I am a ie browser*******");
System.setProperty("webdriver.ie.driver",prop.getProperty("mac"));
        driver =  new InternetExplorerDriver();
}  else if(browserName.equals("edge")) {
	logger.info("********I am a edge browser********");
	System.setProperty("webdriver.edge.driver",prop.getProperty("mac"));
	         driver = new EdgeDriver();
}  else if(browserName.endsWith("firefox")) {
	System.setProperty("webdriver.geckodriver.driver",prop.getProperty("mac"));
	      driver = new FirefoxDriver();
}  else if(browserName.equals("safari")) {
	driver = new SafariDriver();
}
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.get(prop.getProperty("URL"));
}
    public static void initializations() {
	String browserName = prop.getProperty("browser");
	if(browserName.endsWith("chrome")) {
		logger.info("******I am a chrome browser");
		System.setProperty("webdriver.chrome.driver",prop.getProperty("mac"));
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	else if(browserName.equals("chrome")) {
		logger.info("******I am a chrome browser*****");
		System.setProperty("webdriver.chrome.driver",prop.getProperty("windows"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
} 
}

