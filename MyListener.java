package listeners;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.events.WebDriverListener;

import com.google.common.io.Files;

public class MyListener implements WebDriverListener {

	/*
	 * @Override public void afterSendKeys​(WebElement element, Object[] text) { //
	 * TODO Auto-generated method stub
	 * System.out.println("Inside afterChangeValueOf"); //
	 * element.sendKeys("ketan"); }
	 */

	@Override
	public void afterClick(WebElement element) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterClickOn");
		//Write to HTML with green color, and a message on which element click happend
		
	}

	@Override
	public void afterFindElement(WebElement element, By by, WebElement element1) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterFindBy");
		
	}

	@Override
	public void afterBack(WebDriver.Navigation nav) {
		//System.out.println(driver.getCurrentUrl());
		System.out.println("Inside AfterBack");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterForward(WebDriver.Navigation nav) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateForward");
		
	}

	@Override
	public void afterTo(WebDriver.Navigation nav, String url) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateTo - " + url);
	}

	@Override
	public void afterTo(WebDriver.Navigation nav, java.net.URL url) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateTo - " + url);
	}

	@Override
	public void beforeBack(WebDriver.Navigation nav) {
		System.out.println("Inside before Back");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeForward(WebDriver.Navigation nav) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeNavigateForward");
	}

	@Override
	public void beforeTo(WebDriver.Navigation nav, String url) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeNavigateTo - " + url);
	}


	/*
	 * @Override public void onError(Throwable exception, WebDriver driver) { try {
	 * if (driver.getClass().getName().equals(
	 * "org.openqa.selenium.remote.RemoteWebDriver")) { driver = new
	 * Augmenter().augment(driver); } File scrFile = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE);//BASE64,BYTE //String filePath =
	 * "C:\temp" + DateTime ; Files.copy(scrFile, new
	 * File("target/screenshots/error.png")); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
}
