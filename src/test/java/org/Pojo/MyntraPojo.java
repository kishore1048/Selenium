package org.Pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPojo extends BaseClass{

	public MyntraPojo() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement ProfileBtn;
	
	@FindBy(xpath = "//a[text()='login / Signup']")
	private WebElement LoginBtn;
	
	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement MoblieNum;

	public WebElement getProfileBtn() {
		return ProfileBtn;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getMoblieNum() {
		return MoblieNum;
	}

}
