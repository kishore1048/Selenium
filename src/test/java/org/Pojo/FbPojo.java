package org.Pojo;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo  extends BaseClass{
public FbPojo() {
	PageFactory.initElements(driver, this);
}
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy (name = "login")
	private WebElement loginbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
		
	}


