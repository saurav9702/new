package com.taxgenie.testcases;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.testng.annotations.Test;

import com.taxgenie.base.Base;

public class ProductSelection extends Base{
	
	
	
	@Test(priority = 2)
	public void productSelection(){
		try {
			Thread.sleep(3000);
			click("efilng_XPATH");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test(priority=3)
	public void fileUploadPurchase(){
			try {

				Thread.sleep(3000);
				click("finyear_XPATH");
				Thread.sleep(3000);
				click("2020_fin_year_XPATH");
				Thread.sleep(3000);
				click("month_XPATH");
				Thread.sleep(3000);
				click("MAY_XPATH");
				Thread.sleep(3000);
				click("chooose_XPATH");
				Thread.sleep(3000);
				Robot pur = new Robot();
				StringSelection purTemp = new StringSelection("C:\\Users\\Saurav\\Desktop\\UPLOAD TESTING DATA\\UPLOAD FILE TEST\\LESS DATA\\Govt_Purchase_APRIL_19.xlsx");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(purTemp, null);
				System.out.println("selecion " + purTemp);
				Thread.sleep(3000);
				pur.keyPress(KeyEvent.VK_CONTROL);
				pur.keyPress(KeyEvent.VK_V);
				pur.keyRelease(KeyEvent.VK_CONTROL);
				pur.keyRelease(KeyEvent.VK_V);
				Thread.sleep(5000);
				Thread.sleep(3000);
				pur.keyPress(KeyEvent.VK_ENTER);
				pur.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				click("upload_XPATH");

			} catch (Exception e) {
				// TODO: handle exception
			}		
	}
}
