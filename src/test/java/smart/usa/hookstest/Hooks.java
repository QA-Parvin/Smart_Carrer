package smart.usa.hookstest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import smart.usa.basepage.BasePage;

public class Hooks extends BasePage {
	
@Before
public  void getStart() {
	logger.info(">>>>>>>Automation is started<<<<<<<");
	BasePage.getInitialization();
	}

@After
public  void getTearDown() {
	logger.info(">>>>>>>Automation is ended<<<<<<<");
	//driver.quit();
}
}
