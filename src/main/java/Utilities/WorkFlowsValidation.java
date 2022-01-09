package Utilities;

import org.openqa.selenium.WebElement;
import PageObjects.WorkflowsPge;
import Task.Task.BaseClass;

public class WorkFlowsValidation extends BaseClass {
	public static void WorkFlow() throws InterruptedException {
		WorkflowsPge workPage = new WorkflowsPge(driver);
		driver.navigate().to("https://www.joinassembly.com/");
		workPage.workflowIcon().click();
		if (workPage.listAvailable().size() > 1) {
			for (WebElement we : workPage.listAvailable()) {
				System.out.println(we.getText());
			}

		} else {
			System.out.println("The size of the list is less than 1");
		}

		workPage.featuredIcon().click();
		for (WebElement fe : workPage.featuredCategory()) {
			System.out.println(fe.getText());
		}

	}
}