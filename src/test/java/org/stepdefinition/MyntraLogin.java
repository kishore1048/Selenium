package org.stepdefinition;

import org.Pojo.MyntraPojo;
import org.bas.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyntraLogin extends BaseClass{
	MyntraPojo m;
	
	@Given("TO launch the chrome browser and maximise the window")
	public void to_launch_the_chrome_browser_and_maximise_the_window() {
	launchBrowser();
	windowsMaximize();
	}

	@When("To launch the myntra url")
	public void to_launch_the_myntra_url() {
		lauchUrl("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing");
	}

	@When("To click the profile")
	public void to_click_the_profile() throws InterruptedException {
		Thread.sleep(3000);
		m = new MyntraPojo();
		clickBtn(m.getProfileBtn());
	}

	@When("To click the login page")
	public void to_click_the_login_page() {
		m = new MyntraPojo();
		clickBtn(m.getLoginBtn());
	}

	@When("To pass mobile number in mobile field")
	public void to_pass_mobile_number_in_mobile_field() throws InterruptedException {
		Thread.sleep(3000);
		m = new MyntraPojo();
	passText("457896212", m.getMoblieNum());
	}



}
