package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvacedSettingsDeclarationSettingsPage;


public class HrmsPayrollAdvacedSettingsDeclarationSettingsTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvacedSettingsDeclarationSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvacedSettingsDeclarationSettingsPage Declaration = new HrmsPayrollAdvacedSettingsDeclarationSettingsPage(getDriver());
		homePage.SkipPopup();
		Declaration.HrmsPayrollAdvacedSettingsDeclarationSettingsPage();
	}

}
