package org.Pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPojo extends BaseClass {
	public CreateNewAccountPojo() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CreateNewAcc;
	
	
	public WebElement getCreateNewAcc() {
		return CreateNewAcc;
	}
	@FindBy(name = "firstname")
	private WebElement FirstNameTxtBox;
	
	@FindBy(name = "lastname")
	private WebElement SurNameTextBox;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement MobileNumTextBox;
	
	@FindBy (id = "password_step_input")
	private WebElement PassWordTxtBox;
	
	

	public WebElement getFirstNameTxtBox() {
		return FirstNameTxtBox;
	}

	public WebElement getSurNameTextBox() {
		return SurNameTextBox;
	}

	public WebElement getMobileNumTextBox() {
		return MobileNumTextBox;
	}

	public WebElement getPassWordTxtBox() {
		return PassWordTxtBox;
	}

	}
	
	


