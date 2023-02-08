//package org.stepdefinition;
//
//import org.Pojo.FlipkartPojo;
//import org.bas.BaseClass;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class FlipkartLogin extends BaseClass {
//	FlipkartPojo f;
//	
//	@Given("To launch the chrome browser and max the window")
//	public void to_launch_the_chrome_browser_and_max_the_window() {
//		launchBrowser();
//		windowsMaximize();
//	}
//
//	@When("To Launch the Flipkart url")
//	public void to_Launch_the_Flipkart_url() {
//		lauchUrl("https://www.flipkart.com/");
//	}
//
//	@When("To pass mobile number in mobile number field")
//	public void to_pass_mobile_number_in_mobile_number_field() {
//		f = new FlipkartPojo();
//		passText("8678960199", f.getMobilenum());
//	}
//
//	@Then("To close the chrome browser")
//	public void to_close_the_chrome_browser() {
//		//closeEntireBrowser();
//	}
//
//
//}
