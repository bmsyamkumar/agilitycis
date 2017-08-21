package com.web.poc.script;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.SugarCRMPage;
import com.web.automation.pages.SugarContactsInput;
import com.web.automation.utilities.CommonVariables;
import com.web.poc.testObject.ZAPPYInputData;
import com.web.poc.workflow.ZAPPYWorkflow;
public class AgilityCIS_Automation_Demo extends TestEngineWeb {

	private String testCaseFailureReason = "";
	private boolean testCaseStatus = true;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData_Agility_CIS.xlsx";
	protected String sheetName = "ZAPPY";
	Map<String, List<String>> testdata = null;
	private ExtentLogs extentLogs = new ExtentLogs();
	private ZAPPYInputData testData=new ZAPPYInputData();
	private ZAPPYWorkflow ZAPPY;
	boolean isLoginSuccessfull,isLogOutSuccessfull;
	public void TestCaseStatus(Boolean status, String reason) {
		if (status == false) {
			Assert.fail("Test Case Failed because - " + reason);
		}
	}

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public ZAPPYInputData beforeMethod() throws Throwable {
		getTestData();
		ZAPPY = new ZAPPYWorkflow(CommonVariables.CommonDriver.get());
		return testData;
	}
	@Test(description = "ZAPPY", groups = { "smoke", "regression" })
	public void AgilityCIS_Automation_Demo() throws Throwable {
		try {
			
			//Information About Test Script
				extentLogs.info("ZAPPY Automation Demo","ZAPPY Automation Demo from Cigniti");
			//ZAPPY Application Flow
				boolean blnEntry=ZAPPY.fnZappyEntry(testData);
				if(blnEntry)
				{
					extentLogs.pass("ZAPPY Record Entry Status","Successfully Entered the Record in ZAPPY");
				}
				else
				{
					extentLogs.fail("ZAPPY Record Entry Status","Unable  Entered the Record in ZAPPY");
				}
			}
		catch (Exception e) {
			testCaseFailureReason = "Failed to complete ZAPPY Record Entry";
			String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
			extentLogs.fail("ZAPPY ", testCaseFailureReason + "Failed Reason : " + stackTrace);
			testCaseStatus = false;
		}
		TestCaseStatus(testCaseStatus, testCaseFailureReason);
	}
	
	
	
	private void getTestData() throws IOException {
		try {
			
			testData.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Email");
			testData.First_Name = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "First_Name");
			testData.Last_Name = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Last_Name");
			testData.LandLine = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "LandLine");
			testData.Mobile_No = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Mobile_No");
			testData.Postal_Code = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Postal_Code");
			testData.Retype_Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Retype_Email");
			testData.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "State");
			testData.Street_Address = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Street_Address");
			testData.Subrub = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Subrub");
			testData.Title = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Title");
			testData.Type_of_ID = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Type_of_ID");
			} catch (Exception e) {
			String stackTrace = extentLogs.getStackTraceAsString("Test", testCaseFailureReason, e);
			extentLogs.fail("HOOQ ", testCaseFailureReason + "Failed Reason : " + stackTrace);
		}
	}
}

