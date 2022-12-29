package luma.usa.genericCode;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import smart.usa.basepage.BasePage;

  public class CommonUtility extends BasePage{

  public static void getMouseHover(WebElement elem)	{
		Actions ac = new Actions(driver);
       ac.moveToElement(elem).build().perform();

}
  public static void getActionClick(WebElement elem) {
       Actions ac = new Actions(driver);
	   ac.click(elem).build().perform();
	}

  public static Actions getAction() {
	  Actions ac = new Actions(driver);
	return ac;
  }
  public static void getJsClick(WebElement elem) {
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();",elem);
	   }
  

  public static void getLoopingClick(String xpath) {
    WebElement elementClick =  driver.findElement(By.xpath("") );
     for (int i = 0;i <= 299; i++){
    	 elementClick.click();
    	 break;
     }
  }  
     public static void getSelectValues(WebElement ele,String text) {
 		Select select = new Select(ele);
 		select.selectByVisibleText(text);
 	}
     public static void waitThenClick(WebElement element, WebDriver driver) {
 		try {
 			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
 					.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
 			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
 			if (element.isDisplayed() && element.isEnabled()) {
 				getAction().moveToElement(element);
 				getAction().click(element).build().perform();
 			}
 		} catch (Exception e) {
 			logger.log(Level.WARN, "Interrup ted!", e);
 			Thread.currentThread().interrupt();
 		}
 		}
 		public static void getCaptureScreenshot(WebDriver driver, String screenshotName) {
 			try {
 				TakesScreenshot shot = (TakesScreenshot) driver;
 				File store = shot.getScreenshotAs(OutputType.FILE);
 				FileHandler.copy(store, new File("./Screenshot/" + screenshotName + ".png"));
 				System.out.println("Screenshot taken");
 			} catch (Exception e) {
 				System.out.println("Exception while taking screenshot " + e.getMessage());
 			}
 			
 		}
 		
 		
 	
     
  }		
 	
  
    // public static void getAssertion(String actual, String expected) {
   	 // Assert.assertEquals(actual, expected);
   	//  logger.info("******verified expected value******+ expected");
   //	    }
   
        

 
  

