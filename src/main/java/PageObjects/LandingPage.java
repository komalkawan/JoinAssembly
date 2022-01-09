package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	static WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By closeButton = By.xpath("//a[@class='close-popup-modal w-inline-block']");

	public WebElement closeButton() {
		return driver.findElement(closeButton);
	}

	By intercomButton = By.xpath("//div[@aria-label='Open Intercom Messenger']");

	public WebElement intercomButton() {
		return driver.findElement(intercomButton);
	}

	By textArea = By.xpath("//textarea[@name='message']");

	public WebElement textArea() {
		return driver.findElement(textArea);
	}

	By intercomClose = By.xpath("//div[@aria-label='Close Intercom Messenger']");

	public WebElement intercomClose() {
		return driver.findElement(intercomClose);
	}

	By messengeriFrame = By.xpath("//iframe[@name='intercom-launcher-frame']");

	public WebElement messengeriFrame() {
		return driver.findElement(messengeriFrame);
	}

	By clickDismiss = By.xpath("//div[@aria-label='Dismiss']");

	public WebElement clickDismiss() {
		return driver.findElement(clickDismiss);
	}

	By intercomResponse = By.xpath("//div[@class='intercom-1x53arv e1a7e1h30']");

	public List<WebElement> intercomResponse() {
		return driver.findElements(intercomResponse);
	}

}
