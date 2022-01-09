package Task.Task;

import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import PageObjects.LandingPage;
import Utilities.BookDemoFunctionality;
import Utilities.SendingMsg;
import Utilities.WorkFlowsValidation;

public class AppTest extends BaseClass {
	@Test()
	public void Testing() throws IOException, InterruptedException {
		driver = initializeDriver();
		LandingPage landObj = new LandingPage(driver);
		driver.manage().deleteAllCookies();
		driver.get("https://www.joinassembly.com/");
		driver.manage().window().maximize();
		try {
			if (landObj.closeButton().isDisplayed()) {
				landObj.closeButton().click();
			}
			if (landObj.clickDismiss().isDisplayed()) {
				landObj.clickDismiss().click();
			}

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		SendingMsg.Message();
		BookDemoFunctionality.BookDemoValidation();
		WorkFlowsValidation.WorkFlow();
		driver.quit();
	}
}
