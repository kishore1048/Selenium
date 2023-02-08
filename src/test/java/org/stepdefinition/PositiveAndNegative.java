package org.stepdefinition;

import org.Pojo.InmakesPojo;
import org.bas.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegative extends BaseClass{
	InmakesPojo i;
	@Given("User has to launch the chrome browser and maximise the window")
	public void user_has_to_launch_the_chrome_browser_and_maximise_the_window() {
		launchBrowser();
		windowsMaximize();
	}

	@When("User has hit the url of inmakes")
	public void user_has_hit_the_url_of_inmakes() {
		lauchUrl("https://inmakeslh.in/login.php");
	}

	@When("User has pass the data {string} in email field")
	public void user_has_pass_the_data_in_email_field(String em) {
		i = new InmakesPojo();
		passText(em, i.getUsername());
	}

	@When("User has pass the data {string} in password fiels")
	public void user_has_pass_the_data_in_password_fiels(String pw) {
		i = new InmakesPojo();
		passText(pw, i.getPassword());
	}

	@When("User has click the login button")
	public void user_has_click_the_login_button() {
		i = new InmakesPojo();
		clickBtn(i.getLoginbtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}


}
