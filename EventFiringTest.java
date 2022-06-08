package listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;


public class EventFiringTest {
    private WebDriver original_driver, driver;//This WebDriver does not fire the events
   
    MyListener myListener;
    @BeforeMethod
	public void setUp() throws Exception {
    	System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
        original_driver = new FirefoxDriver(); //This does not fire events 
        //WebDriver decorated = new EventFiringDecorator(listener).decorate(original);
        myListener = new MyListener();
        driver = new EventFiringDecorator(myListener).decorate(original_driver);
    //    eventDriver = new EventFiringWebDriver(driver);
     //   eventDriver.register(myListener);//Listening started
    }

    @Test
    public void testEventFiringWebDriver() throws Exception {
 
    	//beforeNavigateTo()
    	driver.navigate().to("http://www.google.com");
        //afterNavigateTo()
     //   eventDriver.unregister(myListener);
       /* eventDriver.findElement(By.name("q"))
        	.sendKeys("Selenium Testing Tools Cookbook");
        eventDriver.findElement(By.id("btnG")).click();*/
    	driver.navigate().to("http://www.yahoo.com");
    //	driver.unregister(myListener)
    	driver.navigate().to("http://www.outlook.com");
    	
    	driver.navigate().back();
    }

    @AfterMethod
	public void tearDown() throws Exception {
        driver.quit();
    }
}
