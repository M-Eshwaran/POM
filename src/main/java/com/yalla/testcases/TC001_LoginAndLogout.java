package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC001_LoginAndLogout extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_LoginAndLogout";
		testcaseDec = "Login into leaftaps";
		author = "Gayatri";
		category = "smoke";
		excelFileName = "CreateLead";
	} 

	@Test(dataProvider="fetchData") 
	public void loginAndLogout(String uName, String pwd,String cname,String Fname,String Lname) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickMyLead()
	    .createCompanyName(cname)
	    .createFirstName(Fname)
	    .createLastName(Lname)
	    .clickCeateLead();
	    
	    
		
		
		
		
		
		/*LoginPage lp = new  LoginPage();
		lp.enterUserName();
		lp.enterPassWord();*/
		
	}
	
}






