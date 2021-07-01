package org.Frameworkday1;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frameworkday9PomLoginpagecont extends BaseClass{
	public static void main(String[] args) {
		
		BaseClass baseClass = new BaseClass();
		baseClass.getDriver();
		baseClass.launchUrl("https://adactinhotelapp.com/");
				Frameworkday7PomLoginpage3 page = new Frameworkday7PomLoginpage3();
				WebElement txtUserName = page.getTxtUserName();
				baseClass.type(txtUserName, "dsfdsfdsf");
				driver.navigate().refresh();
				baseClass.type(txtUserName, "Java");
				WebElement txtPassword =  page.getTxtPassword();
				baseClass.type(txtPassword,"dggdsg");
				WebElement btnLogin = page.getBtnlogin();
				baseClass.buttonClick(btnLogin);
	}
 

}
