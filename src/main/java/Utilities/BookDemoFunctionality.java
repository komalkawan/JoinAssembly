package Utilities;

import org.testng.Assert;

import PageObjects.BookDemoPage;
import PageObjects.LandingPage;
import Task.Task.BaseClass;

public class BookDemoFunctionality extends BaseClass {
	public static void BookDemoValidation() throws InterruptedException {
		String successExpectedMsg = "Create a new Assembly";
		BookDemoPage demoPage = new BookDemoPage(driver);
		demoPage.BookDemoButton().click();
		driver.switchTo().frame(demoPage.framePath());
		demoPage.timeselection().click();
		demoPage.firstName().sendKeys("Testfirstname");
		demoPage.lastName().sendKeys("testlast");
		demoPage.eMail().sendKeys("testemail@gmail.com");
		demoPage.company().sendKeys("testassignment");
		demoPage.phone().sendKeys("123567890");
		demoPage.dropdown().click();
		demoPage.value().click();
		demoPage.confirmButton().click();
		Thread.sleep(5000);
		String successActualMsg = demoPage.successVerify().getText();
		Assert.assertEquals(successActualMsg, successExpectedMsg);
	}
}