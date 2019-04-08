package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class myLeadsPage extends Annotations{
	
	public myLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Create Lead") WebElement CreateLeadLink; 
	public createLeadPage clickMyLead() {
		
		click(CreateLeadLink);
		return new createLeadPage();
}
	
	

}
