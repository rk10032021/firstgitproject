package scripts.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrowserCommand {
	WebDriver driver;
	
  @Test
  public void BrowserCommandTest() throws InterruptedException {
	  
	  driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://nichethyself.com/tourism/home.html");
		Thread.sleep(2000);
		driver.get("http:flipkart.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();// refresh 1
		driver.navigate().to("http://www.google.com");

		Thread.sleep(2000);
		driver.navigate().to(driver.getCurrentUrl());// refresh 2
		Thread.sleep(2000);
		String MyUrl = driver.getCurrentUrl();
		System.out.println(MyUrl);
		WebElement SearchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));// cssSelector
		// Path=.gLFyf.gsfi

        SearchBox.sendKeys("facebook");// 4th doubtfull
      // SearchBox.submit();

       Thread.sleep(2000);

       // driver.get("http://www.google.com");//refreshType 3

     // String MySourceCode=driver.getPageSource();
     // System.out.println(MySourceCode);

  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().getCookies().clear();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
  }

  @AfterMethod
  public void afterMethod() {
	  
 //driver.quit();
  }

}
