package org.sample;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.pages.LoginPage;
import org.pages.RegisterPage;
import org.utility.BaseClass;

public class Sample extends BaseClass{

	public static void main(String[] args) throws IOException {
				
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		maximize();
		implicitWait(10);
		
		//RegisterPage rp = new RegisterPage();
		//rp.register("sujatha", "pr", "65418", "gg@gmail.com");		
		
		LoginPage lp = new LoginPage();
		String uname = getExcel("Excelbook", "Sheet1", 1, 1);		
		String pass = getExcel("Excelbook", "Sheet1", 2, 2);
		System.out.println("cell value - "+uname+", cell2 value - "+pass);
		lp.login(uname, pass);
		
	}
}
