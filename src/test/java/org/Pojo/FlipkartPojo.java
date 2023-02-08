package org.Pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass{
	
	public FlipkartPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement Mobilenum;
	
	
	public WebElement getMobilenum() {
		return Mobilenum;
	}

}
