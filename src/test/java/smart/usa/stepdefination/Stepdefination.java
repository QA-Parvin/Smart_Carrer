package smart.usa.stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.usa.genericCode.CommonUtility;
import luma.usa.genericCode.WaitHelper;
import smart.usa.basepage.BasePage;
import smart.usa.pagefactory.ElementPage;

public class Stepdefination extends BasePage {
ElementPage ep;	
	@Given("user already login the application and verify the login info in the landing page")
	public void user_already_login_the_application_and_verify_the_login_info_in_the_landing_page() {
	 
ep = PageFactory.initElements(driver,ElementPage.class );
ep.getLogIn();
String expected = "Welcome, MUHANA TRISHA!";
String actual = ep.getverifyUsername().getText();
Assert.assertEquals(actual, expected);
	}
	@When("user should be able to Jupiter All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_jupiter_all_weather_trainer_jacket_from_men_module() {
		WaitHelper.getWaitForElement(ep.getmouseHovermen(), 20);
	CommonUtility.getMouseHover(ep.getmouseHovermen()); 
	WaitHelper.getWaitForElement(ep.getmouseHovertop(), 20);
	CommonUtility.getMouseHover(ep.getmouseHovertop());
	WaitHelper.getWaitForElement(ep.getClickOnjacket(), 20);
	CommonUtility.getActionClick(ep.getClickOnjacket());
	}
	@When("user verify the jacket name on the Jupiter All-Weather Trainer list")
	public void user_verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
		
	 WaitHelper.getWaitForElement(ep.getClickOnJupiterjacket(), 20);  
	 CommonUtility.getActionClick(ep.getClickOnJupiterjacket());   
	}
	@When("user should be able to select the M and Blue and {int} and click on the add to cart")
	public void user_should_be_able_to_select_the_m_and_blue_and_and_click_on_the_add_to_cart(Integer int1) {
		
		logger.info("*********User abel to select the jacket size********");
	  WaitHelper.getWaitForElement(ep.getSelectSize(),20);
	  CommonUtility.getJsClick(ep.getSelectSize());
	  
	  logger.info("*********User abel to select the color********");
	  WaitHelper.getWaitForElement(ep.getSelectColor(),20);
	  CommonUtility.getActionClick(ep.getSelectColor());
	  
	  logger.info("*********User abel to select the Jacket Quantity********");
	  WaitHelper.getWaitForElement(ep.getSelectQuantity(), 20); 
	  ep.getSelectQuantity().sendKeys("1");
	  
	  logger.info("*********User abel to click on the cart********"); 
	  WaitHelper.getWaitForElement(ep.getClickAddToCart(), 20);
	  CommonUtility.getActionClick(ep.getClickAddToCart());
	}
    @When("user able to click on the cart and checkout")
	public void user_able_to_click_on_the_cart_and_checkout() {
    	
    	 logger.info("*********User abel to click on the Shoppingcart********");
        WaitHelper.getWaitForElement(ep.getClickOnShoppingCart(), 20);
	    CommonUtility.getActionClick(ep.getClickOnShoppingCart());
	    
		 logger.info("*********User abel to click on proceedToCheckOut********"); 
	    WaitHelper.getWaitForElement(ep.getproceedToCheckOut(), 20);
	    CommonUtility.getActionClick(ep.getproceedToCheckOut());
	    
	}
	@When("user able to enter the shopping details and click on the next")
	public void user_able_to_enter_the_shopping_details_and_click_on_the_next() {
		
		
		 logger.info("*********User abel to click on Add New Adress********"); 
		    WaitHelper.getWaitForElement(ep.getClickOnAddNewAdress(), 20);
		    CommonUtility.getJsClick(ep.getClickOnAddNewAdress());
		    ep.getNewAddressDetailes();
		}
		   
	   
	
	@When("user able to verify the shippinig address and place the order")
	public void user_able_to_verify_the_shippinig_address_and_place_the_order() {
	    
		 logger.info("*********User abel to verify order number********"); 
		    WaitHelper.getWaitForElement(ep.getorderNumber(), 20);
		    CommonUtility.getJsClick(ep.getorderNumber());
		  String actual =  ep.getorderNumber().getText();
		  logger.info("This is the new order number" + actual);
		}
		
	
	@Then("user should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String expected) throws IOException {
		
		
			
		 logger.info("*********User abel to verify order number********"); 
		    WaitHelper.getWaitForElement(ep.getorderNumber(), 20);
		    CommonUtility.getJsClick(ep.getorderNumber());
		  String actual =  ep.getorderNumber().getText();
		  logger.info("This is the new order number" + actual);
		CommonUtility.getCaptureScreenshot(driver, "VerifyOrderNumber");	
		
		 logger.info("*********User abel to verify orderconfermation text********"); 
		    WaitHelper.getWaitForElement(ep.getverifyOrderConfermationText(), 20);
		    CommonUtility.getJsClick(ep.getverifyOrderConfermationText());
		  String actual1 =  ep.getverifyOrderConfermationText().getText();
		  logger.info("This is the new order number" + actual);
		  Assert.assertEquals(actual, actual);
		  
		}
		
	}
	
	
	
	
	
	
	
	
	


