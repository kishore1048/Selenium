package org.Pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IciciBankPojo extends BaseClass {
	public IciciBankPojo() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement LoginBtn;
	
	@FindBy(id = "AuthenticationFG.USER_PRINCIPAL")
	private WebElement UserName;
	
	@FindBy(name = "AuthenticationFG.ACCESS_CODE")
	private WebElement Pw;

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPw() {
		return Pw;
	}

}
