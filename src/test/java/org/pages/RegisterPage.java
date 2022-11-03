package org.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class RegisterPage extends BaseClass{
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement txtlastname;	
	//@FindBy(xpath="//a[text()='Create New Account']")
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnaccount;	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement txtemail;
	//(//input[@type='password'])[2]
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement txtpass;
	@FindBy(id="day")
	private WebElement selectDay;
	@FindBy(id="month")
	private WebElement selectMon;
	@FindBy(id="year")
	private WebElement selectYear;
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement genderFemale;
	@FindBy(xpath="(//input[@name='sex'])[2]")
	private WebElement genderMale;
	@FindBy(xpath="(//input[@name='sex'])[3]")
	private WebElement genderCustom;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitBtn;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getBtnaccount() {
		return btnaccount;
	}	
	public WebElement getTxtemail() {
		return txtemail;
	}
	public void setTxtemail(WebElement txtemail) {
		this.txtemail = txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}
	
	public WebElement getSelectDay() {
		return selectDay;
	}

	public void setSelectDay(WebElement selectDay) {
		this.selectDay = selectDay;
	}

	public WebElement getSelectMon() {
		return selectMon;
	}

	public void setSelectMon(WebElement selectMon) {
		this.selectMon = selectMon;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public void setSelectYear(WebElement selectYear) {
		this.selectYear = selectYear;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getGenderCustom() {
		return genderCustom;
	}

	public void register(String fname, String lname, String pass, String email) {
		clickBtn(getBtnaccount());
		sendKeys(getFirstname(),fname);
		sendKeys(getTxtlastname(), lname);
		sendKeys(getTxtpass(), pass);
		sendKeys(getTxtemail(), email);
		selectByValue(getSelectDay(), "24");
		selectByValue(getSelectMon(), "8");
		selectByIndex(getSelectYear(), 3);
		clickBtn(getGenderFemale());
		clickBtn(getSubmitBtn());
	}
	
}
