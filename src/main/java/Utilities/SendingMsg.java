package Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import PageObjects.LandingPage;
import Task.Task.BaseClass;

public class SendingMsg extends BaseClass {
	public static void Message() throws InterruptedException {
		LandingPage landObj = new LandingPage(driver);
		landObj.intercomButton().click();
		Thread.sleep(5000);
		driver.switchTo().frame("intercom-messenger-frame");
		landObj.textArea().sendKeys("Hello" + Keys.ENTER);
		Thread.sleep(15000);
		for (WebElement response : landObj.intercomResponse()) {
			System.out.println(response.getText());
		}
		driver.switchTo().parentFrame();
		driver.switchTo().frame("intercom-launcher-frame");
		landObj.intercomClose().click();
		driver.switchTo().parentFrame();
	}
}
