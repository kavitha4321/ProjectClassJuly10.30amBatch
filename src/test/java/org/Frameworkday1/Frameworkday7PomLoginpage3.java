package org.Frameworkday1;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Frameworkday7PomLoginpage3 extends BaseClass{
	
	
	public Frameworkday7PomLoginpage3() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id = "username")
	private WebElement txtUserName;
	
	//@FindAll({@FindBy(id = "pass"), @FindBy(xpath ="//input[@name='password']")})
	
	//@FindBys({@FindBy(id = "pass"), @FindBy(xpath ="//input[@name='password']")})
	
 @FindBy(xpath ="//input[@name='password']")
 private WebElement txtPassword;

 @FindBy(id = "login")
 private WebElement btnlogin;

 
 public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
 
 

}
