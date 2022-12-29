package smart.usa.pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import luma.usa.genericCode.CommonUtility;
import luma.usa.genericCode.WaitHelper;
import smart.usa.basepage.BasePage;

public class ElementPage extends BasePage{

	public ElementPage() {
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]")
 @CacheLookup
 private WebElement ClickSignIn;
 public WebElement getClickSignIn() {
 return ClickSignIn;

 }

 @FindBy(xpath = "//*[@id='email']")
 @CacheLookup
 private WebElement userName;

 public WebElement getUserName() {
 return userName;
 }
 
 @FindBy(xpath = "(//*[@type='password'])[1]")
 @CacheLookup
 private WebElement passWord;
 public WebElement getpassWord() {
 return passWord;
 }

 @FindBy(xpath = "(//span[text()='Sign In'])[1]")
 @CacheLookup
 private WebElement clickLogIn;

 public WebElement getClickLogIn() {
 return clickLogIn;
 }
 
 @FindBy(xpath = "(//span[text()='Welcome, MUHANA TRISHA!'])[1]")
 @CacheLookup
 private WebElement verifyUsername;
 public WebElement getverifyUsername() {
 return verifyUsername;
 }

 @FindBy(xpath = "//span[text()='Men']")
 @CacheLookup 
 private WebElement mouseHovermen;
 public WebElement getmouseHovermen() {
 return mouseHovermen;
 }

 @FindBy(xpath = "(//span[text()='Tops'])[2]")
 @CacheLookup
 private WebElement mouseHovertop;
 public WebElement getmouseHovertop() {
 return mouseHovertop;
 }

 @FindBy(xpath = "(//*[text()='Jackets'] )[2]")
 @CacheLookup
 private WebElement ClickOnjacket;
 public WebElement getClickOnjacket() {
 return ClickOnjacket;
 }

 @FindBy(xpath = "(//*[@href='https://magento.softwaretestingboard.com/jupiter-all-weather-trainer.html'])[1]")
 @CacheLookup
 private WebElement ClickOnJupiterjacket;
 public WebElement getClickOnJupiterjacket() {
 return ClickOnJupiterjacket;
 }

 @FindBy(xpath = "(//*[@index='2'])[1]")
 @CacheLookup
 private WebElement SelectSize;
 public WebElement getSelectSize() {
 return SelectSize;
 }

 @FindBy(xpath = "(//*[@index='0'])[2]")
 @CacheLookup
 private WebElement SelectColor;
 public WebElement getSelectColor() {
 return SelectColor;
 }

 @FindBy(xpath = "//*[@itemscope ='itemscope']")
 @CacheLookup
 private WebElement SelectQuantity;
 public WebElement getSelectQuantity() {
 return SelectQuantity;
 }

 @FindBy(xpath = "//span[text()='Add to Cart']")
 @CacheLookup
 private WebElement ClickAddToCart;
 public WebElement getClickAddToCart() {
 return ClickAddToCart;
 }

 @FindBy(xpath = "//*[@class='action showcart']")
 @CacheLookup
 private WebElement ClickOnCart;
 public WebElement getClickOnToCart() {
 return ClickOnCart;
 }

 @FindBy(xpath = "//*[text()='shopping cart']")
 @CacheLookup
 private WebElement ClickOnShoppingCart;
 public WebElement getClickOnShoppingCart() {
 return ClickOnShoppingCart;
 }

     @FindBy(xpath = "//*[text()='Proceed to Checkout']")
     @CacheLookup
     private WebElement proceedToCheckOut;
     public WebElement getproceedToCheckOut() {
  	 return proceedToCheckOut;
       }

      @FindBy(xpath = "//*[@class='action action-show-popup']")
      @CacheLookup
      private WebElement ClickOnAddNewAdress;
      public WebElement getClickOnAddNewAdress() {
      return ClickOnAddNewAdress;
        }

    
            // Address Detailed elements
   
      @FindBy(xpath = "(//*[@type='text'])[2]")
      @CacheLookup
      private WebElement EnterFirstName;
      public WebElement getEnterFirstName() {
 	  return  EnterFirstName;
       }

     @FindBy(xpath = "(//*[@type='text'])[3]")
     @CacheLookup
     private WebElement EnterLastName;
     public WebElement getEnterLastName() {
   	 return  EnterLastName;
       }

     @FindBy(xpath = "(//*[@type='text'])[4]")
     @CacheLookup
     private WebElement EnterCompanyName;
     public WebElement getEnterCompanyName() {
     return  EnterCompanyName;
       }

     @FindBy(xpath = "(//*[@type='text'])[5]")
     @CacheLookup
     private WebElement EnterAddress;
     public WebElement getEnterAddress() {
     return  EnterAddress;
       }

                 @FindBy(xpath = "(//*[@type='text'])[8]")
                 @CacheLookup
                 private WebElement EnterCityName;

                  public WebElement getEnterCityName() {
                 	return  EnterCityName;
                   }
                  
                  @FindBy(xpath = "(//*[@class='select'])[1]")
                  @CacheLookup
                  private WebElement SelectState;

                   public WebElement getSelectState() {
                  	return  SelectState;
                    }

                   @FindBy(xpath = "(//*[@type='text'])[10]")
                   @CacheLookup
                   private WebElement EnterZipCode;

                    public WebElement getEnterZipCode() {
                   	return  EnterZipCode;
                     }

                    @FindBy(xpath = "(//*[@class='select'])[2]")
                    @CacheLookup
                    private WebElement EnterCountryName;

                     public WebElement getEnterCountryName() {
                    	return  EnterCountryName;
                      }

                     @FindBy(xpath = "(//*[@type='text'])[11] ")
                     @CacheLookup
                     private WebElement EnterPhoneNumber;

                      public WebElement getEnterPhoneNumber() {
                     	return  EnterPhoneNumber;
                       }

                      @FindBy(xpath = "//*[text()='Ship here']")
                      @CacheLookup
                      private WebElement ClickOnShipHere;

                       public WebElement getClickOnShipHere() {
                      	return  ClickOnShipHere;
                        }

                       @FindBy(xpath = "(//*[@type='radio'])[2]")
                       @CacheLookup
                       private WebElement SelectShippingMethod;

                        public WebElement getSelectShippingMethod() {
                       	return SelectShippingMethod;
                         }
                        @FindBy(xpath = "(//*[@type='submit'])[2]")
                        @CacheLookup
                        private WebElement ClickOnNext;

                         public WebElement getClickOnNext() {
                        	return ClickOnNext;
                          }
  
                         @FindBy(xpath = "//*[text()='Place Order']")
                         @CacheLookup
                         private WebElement ClickOnPlaceOrder;

                          public WebElement getClickPlaceOrder() {
                         	return ClickOnPlaceOrder;
                           }

                          @FindBy(xpath = "//*[text()='Your order number is: ']")
                          @CacheLookup
                          private WebElement orderNumber;

                           public WebElement getorderNumber() {
                          	return orderNumber;
                            }

                           @FindBy(xpath = "//*[text()='Thank you for your purchase!']")
                           @CacheLookup
                           private WebElement verifyOrderConfermationText;

                            public WebElement getverifyOrderConfermationText() {
                           	return verifyOrderConfermationText;
                             }

  public void getLogIn() {
	getClickSignIn().click();
	logger.info("******User able to click sign in button*******");
	getUserName().sendKeys(prop.getProperty("userName"));
	logger.info("******User able to enter the user name*******");
	getpassWord().sendKeys(prop.getProperty("textpassword"));
	logger.info("******User able to enter password*******");
	getClickLogIn().click();
	logger.info("******User able to click logIn button*******");
	
}

  public void getNewAddressDetailes() {
	logger.info("******User able to enter First Name*******");
	WaitHelper.getWaitForElement(getEnterFirstName(), 20);
	getEnterFirstName().clear();
	getEnterFirstName() .sendKeys("Alam");
	
	logger.info("******User able to enter Last Name*******");
	WaitHelper.getWaitForElement(getEnterLastName(), 20);
	getEnterLastName().clear();
	getEnterLastName().sendKeys("Mohammed");
	
	logger.info("******User able to enter Company Name as Home*******");
	WaitHelper.getWaitForElement( getEnterCompanyName(), 20);
	 getEnterCompanyName().clear();
	 getEnterCompanyName() .sendKeys("Home");
	
	 logger.info("******User able to enter Home Address*******");
		WaitHelper.getWaitForElement( getEnterAddress(), 20);
		getEnterAddress().clear();
		getEnterAddress() .sendKeys("30 Wall Street");
		
  logger.info("******User able to enter CityName*******");
  WaitHelper.getWaitForElement( getEnterCityName(), 20);
  getEnterCityName().clear();
  getEnterCityName() .sendKeys("Manhattan");
  
  logger.info("******User able to select state*******");
  WaitHelper.getWaitForElement( getSelectState() , 20);
  CommonUtility.getSelectValues( getSelectState() , "New York");	
	
  logger.info("******User able to enter Zipcode*******");
  WaitHelper.getWaitForElement( getEnterZipCode(), 20);
  getEnterZipCode().clear();
  getEnterZipCode() .sendKeys("10005");
  
  logger.info("******User able to select country as United States *******");
  WaitHelper.getWaitForElement( getEnterCountryName(), 20);
  CommonUtility.getSelectValues(getEnterCountryName(), "United States");
  
  logger.info("******User able to enter shipper phone number *******");
  WaitHelper.getWaitForElement( getEnterPhoneNumber(), 20);
  getEnterPhoneNumber().clear();
  getEnterPhoneNumber() .sendKeys("3473555432");
		  
  logger.info("******User able to click on ship here button*******");
  WaitHelper.getWaitForElement( getClickOnShipHere(), 20);
  CommonUtility.getActionClick(getClickOnShipHere());
  
  logger.info("******User able to select shipping method*******");
  driver.navigate().refresh();
 // WaitHelper.getWaitForElement(getSelectShippingMethod(), 20);
 //CommonUtility.getJsClick( getSelectShippingMethod());
  CommonUtility.waitThenClick(getSelectShippingMethod(), driver);
  
  //Alert alert = driver.switchTo().alert();
 // alert.accept();
 
   logger.info("******User able to click next*******");
  WaitHelper.getWaitForElement( getClickOnNext(), 20);
  CommonUtility.getJsClick( getClickOnNext());
 	
  logger.info("******User able to click Place Order*******");
  WaitHelper.getWaitForElement( getClickPlaceOrder(), 20);
  CommonUtility.getJsClick( getClickPlaceOrder());
  
  logger.info("******User able to get order number*******");
  WaitHelper.getWaitForElement( getorderNumber(), 20);
  CommonUtility.getJsClick( getorderNumber());
  
  logger.info("******User able to get order confermation number*******");
  WaitHelper.getWaitForElement( getverifyOrderConfermationText(), 20);
  CommonUtility.getJsClick( getverifyOrderConfermationText());
 
	//How to handle static dropdown	
		// In order to handle static dropdown we need to select the class,when we 
		//create the select class object,then with the help of object we can select the value by visible text,
		//index,values
   // How to handle dynamic dropdown
		//We can handle dynamic dropdown by Actions class(moveToElement
}

}



