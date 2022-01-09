package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookDemoPage {
	static WebDriver driver;

	public BookDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	By BookDemoButton = By.xpath("//a[@id='demo-header-button']");

	public WebElement BookDemoButton() {
		return driver.findElement(BookDemoButton);
	}

	By framePath = By.xpath("//iframe[contains(@src,'joinassembly')]");

	public WebElement framePath() {
		return driver.findElement(framePath);
	}

	By timeselection = By.xpath("//div[@class='p-y-1 p-right-1'][1]");

	public WebElement timeselection() {
		return driver.findElement(timeselection);
	}

	By firstName = By.xpath("//input[@name='firstName']");

	public WebElement firstName() {
		return driver.findElement(firstName);
	}

	By lastName = By.xpath("//input[@name='lastName']");

	public WebElement lastName() {
		return driver.findElement(lastName);
	}

	By eMail = By.xpath("//input[@name='email']");

	public WebElement eMail() {
		return driver.findElement(eMail);
	}

	By company = By.xpath("//input[@name='company']");

	public WebElement company() {
		return driver.findElement(company);
	}

	By phone = By.xpath("//input[@name='phone']");

	public WebElement phone() {
		return driver.findElement(phone);
	}

	By dropdown = By.xpath(" //select[@name='chat_application']");

	public WebElement dropdown() {
		return driver.findElement(dropdown);
	}

	By value = By.xpath("//option[@value='Other']");

	public WebElement value() {
		return driver.findElement(value);
	}

	By confirmButton = By.xpath("//i18n-string[text()='Confirm']");

	public WebElement confirmButton() {
		return driver.findElement(confirmButton);
	}

	By successVerify = By.xpath("//h5[text()='Create a new Assembly']");

	public WebElement successVerify() {
		return driver.findElement(successVerify);
	}
}