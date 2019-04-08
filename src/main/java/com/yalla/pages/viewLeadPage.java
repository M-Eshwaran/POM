package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.yalla.testng.api.base.Annotations;

public class viewLeadPage extends Annotations{
	
	public viewLeadPage() {
		
	}
	@FindBy(xpath = "//span[@id='viewLead_firstName_sp']") WebElement viewPage;
	public void verifyViewLead() {
		WebElement fname = viewPage;
		String text = fname.getText();
		if(text.equals("gopi")){
			System.out.println("veified" +text);
		}
		else {
			System.out.println("Non Found" +text);
		}
		
		
	}
	
	

}
