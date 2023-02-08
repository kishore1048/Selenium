package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.Pojo.AmazonLoginPojo;
import org.apache.commons.io.FileUtils;
import org.bas.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin extends BaseClass{
	AmazonLoginPojo a;
	
	
	
	@Given("To launch the chrome browser and max the window")
	public void toLaunchTheChromeBrowserAndMaxTheWindow() {
		launchBrowser();
		windowsMaximize();
	}

	@When("To Launch the amazon url")
	public void toLaunchTheAmazonUrl() {
		lauchUrl("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=15867172651586107203&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040218&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMIs9qXr73i_AIVI5pmAh1TAwOeEAAYASAAEgLeRPD_BwE");
	}

	@When("To click the login page of amazon")
	public void toClickTheLoginPageOfAmazon() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		a = new AmazonLoginPojo();
	clickBtn(a.getLoginBtn());
	}

	@When("To pass mobile number in mobile number field")
	public void toPassMobileNumberInMobileNumberField() {
		a = new AmazonLoginPojo();
		passText("789456214", a.getEmailTxt());
	}
	
	@When("To take the screen shot")
	public void to_take_the_screen_shot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("./screenshot\\amazon.png");
		FileUtils.copyFile(img, f);
	}
	
	@Then("To close the chrome browser")
	public void toCloseTheChromeBrowser() throws InterruptedException {
	closeEntireBrowser();
	}




}
