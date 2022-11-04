package org.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(id="email"), @FindBy(xpath="//input[@id='email']")})
	private List<WebElement> txtusername;
	
	public List<WebElement> getTxtusername() {
		return txtusername;
	}
	
	
	@FindAll({@FindBy(id="pass"), @FindBy(xpath="//input=[@id='pass']")})
	private WebElement txtpass;
	public WebElement getTxtpass() {
		return txtpass;
	}

	@FindAll({@FindBy(name="login"), @FindBy(xpath="//button[@name='login'")})
	private WebElement btnlogin;
	public WebElement getBtnlogin() {
		return btnlogin;
	
	}	
	
	public void login(String user, String pass) {
		sendKeys(getTxtusername().get(0), user);
		sendKeys(getTxtpass(), pass);
		clickBtn(getBtnlogin());
		System.out.println("Login page for facebook website");
	}
	

}
