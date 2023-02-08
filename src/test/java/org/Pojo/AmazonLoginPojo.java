package org.Pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPojo extends BaseClass{
 public AmazonLoginPojo() {
	 PageFactory.initElements(driver, this);
}
 @FindBy(xpath = "//span[text()='Account & Lists']")
 private WebElement loginBtn;
 
 @FindBy(id = "ap_email")
 private WebElement emailTxt;

public WebElement getLoginBtn() {
	return loginBtn;
}

public WebElement getEmailTxt() {
	return emailTxt;
}
}
