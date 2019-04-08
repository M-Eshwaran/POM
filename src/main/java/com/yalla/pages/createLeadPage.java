package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class createLeadPage extends Annotations{
	
	public createLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="createLeadForm_companyName") private WebElement CreateCompanyName;
	public createLeadPage createCompanyName(String data) {
		clearAndType(CreateCompanyName, data);
		return this;
	}
	@FindBy(id ="createLeadForm_firstName") private WebElement CreateFirstName;
	public createLeadPage createFirstName(String data) {
		clearAndType(CreateFirstName, data);
		return this;
	}
	@FindBy(id ="createLeadForm_lastName") private WebElement CreateLastName;
	public createLeadPage createLastName(String data) {
		clearAndType(CreateLastName, data);
		return this;
		
	}
	@FindBy(name = "submitButton") WebElement SubmitB;
	public viewLeadPage clickCeateLead() {
		click(SubmitB);
		return new viewLeadPage();
	}
	
		

}