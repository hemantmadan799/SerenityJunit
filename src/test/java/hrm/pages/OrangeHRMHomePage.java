package hrm.pages;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {

	public void verifyTitle() {
		String title = getDriver().getTitle();
//		Assert.assertTrue(title.contains("OrangHRM"));
	}

	public void enterUsernamePassword() {
		$(By.id("txtUsername")).type("Admin");
		$(By.id("txtPassword")).typeAndEnter("admin123");
	}

	public void verifyLogin() {
		String url = getDriver().getCurrentUrl();
//		Assert.assertTrue(url.contains("dashboard"));
	}
}
