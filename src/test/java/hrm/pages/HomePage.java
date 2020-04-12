package hrm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	OrangeHRMHomePage home;
	@Step("this will verify the title")
	public void verifyTitle()
	{
		home.verifyTitle();
	}
	@Step("this step will enter login details")
	public void enterCredentials()
	{
		home.enterUsernamePassword();
	}
	@Step("this step will verify Dashboard after successful login")
	public void verifyDashboard()
	{
		home.verifyLogin();
	}

}
