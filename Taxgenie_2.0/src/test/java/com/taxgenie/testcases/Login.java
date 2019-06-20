package com.taxgenie.testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import org.openqa.selenium.By;
import com.taxgenie.base.Base;

public class Login extends  Base {
	
	@Test(priority=0)
	public void login() throws InterruptedException {
		
		
		Thread.sleep(4000);
		type("user_ID", "saurav@taxgenie.in");
		type("password_ID", "Taxgenie@123");
		Thread.sleep(3000);
		String sau= driver.findElement(By.id("captcha")).getText();
		Thread.sleep(3000);
		type("captcha1_ID", sau);
		click("save_ID");
				
	}
	
	@Test(priority=1)
	public void companyselection() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		click("maharashtra_XPATH");
		
		
		
		}
	
	
}
