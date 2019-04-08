package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;


public class myHomePage extends Annotations{
	
	public myHomePage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText = "Leads") WebElement leadsLink;
	public myLeadsPage clickLead() {
		
		click(leadsLink);
		return new myLeadsPage();
}
	
	

}
