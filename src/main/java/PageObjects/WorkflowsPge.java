package PageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkflowsPge {
	static WebDriver driver;

	public WorkflowsPge(WebDriver driver) {
		this.driver = driver;
	}

	By workflowIcon = By.xpath("//a[text()='Workflows']");

	public WebElement workflowIcon() {
		return driver.findElement(workflowIcon);
	}

	By listAvailable = By.xpath("//div[@class='integration-category-item w-dyn-item']");

	public List<WebElement> listAvailable() {
		return driver.findElements(listAvailable);
	}

	By featuredIcon = By.xpath("//div[text()='Featured']");

	public WebElement featuredIcon() {
		return driver.findElement(featuredIcon);
	}

	By featuredCategory = By.xpath("//p[@class='paragraph template-page']");

	public List<WebElement> featuredCategory() {
		return driver.findElements(featuredCategory);
	}
}
