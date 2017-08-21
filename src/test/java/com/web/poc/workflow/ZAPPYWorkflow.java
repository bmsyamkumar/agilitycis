package com.web.poc.workflow;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.BasePage;
import com.web.automation.utilities.ConfigManager;
import com.web.poc.testObject.ZAPPYInputData;
import com.web.poc.testObject.ZAPPYLocators;

public class ZAPPYWorkflow extends BasePage {	
	public WebDriver driver=ActionsLibrary.driver;
	//public EventFiringWebDriver driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public ZAPPYWorkflow(WebDriver driver) {
		super(driver);
		
	}
	
	
	//ZAPPY Workflow Functions
	public boolean fnZappyEntry(ZAPPYInputData objData) throws Throwable
	{
		boolean blnStatus=false;
		try
		{
			extentLogs.info("ZAPPY On Board Page Entry","ZAPPY On Board Page Entry");
			//Click on Home Page
			actionLib.Click(ZAPPYLocators.Login,"ZAPPY Login to On-Board");
			Thread.sleep(5000);
			fnPageWait();
			extentLogs.info("ZAPPY Record Entry","ZAPPY Record Entry");
			//Entry Data to ZAPPY
			actionLib.Click(ZAPPYLocators.chkExistingCustomer,"Existing Customer");
			actionLib.Click(ZAPPYLocators.chkPropertTypeTransfer,"Property Type Transfer");
			//Enter Data to Find
			driver.findElement(ZAPPYLocators.edtAddress).sendKeys(Keys.ENTER);
			driver.findElement(ZAPPYLocators.edtAddress).sendKeys("22 B");
			Thread.sleep(5000);
			WebElement eleSearch=driver.findElement(By.xpath("/html/body/div[3]"));
			List<WebElement> eleAllDiv=eleSearch.findElements(By.tagName("div"));
			System.out.println(eleAllDiv.size());
			outer: for(int j=0;j<eleAllDiv.size();j++)
			{
				List<WebElement> elSpan=eleAllDiv.get(j).findElements(By.tagName("span"));
				System.out.println(elSpan.size());
				for(int k=0;k<elSpan.size();k++)
				{
					String strText=elSpan.get(k).getText();
					System.out.println(strText);
					if(strText.equals("Bourke Street, Melbourne, Victoria, Australia"))
					{
						elSpan.get(k).click();
						System.out.println("Click Successfully");
						break outer;
					}
				}
			}
			System.out.println("Test");
			Thread.sleep(4000);
			actionLib.Click(ZAPPYLocators.btnSearch,"Search Supply Address");
			Thread.sleep(5000);
			fnPageWait();
			WebElement eleTable=driver.findElement(By.xpath("//*[@id='h-plan-picker-AddressSearch']/table"));
			List<WebElement> eleTR=eleTable.findElements(By.tagName("tr"));
			System.out.println(eleTR.size());
			for(int i=1;i<eleTR.size();i++)
			{
				List<WebElement> eleButton=eleTR.get(i).findElements(By.tagName("td"));
				System.out.println(eleButton.size());
				List<WebElement> btnViewPrice=eleButton.get(2).findElements(By.tagName("a"));
				System.out.println(btnViewPrice.size());
				btnViewPrice.get(0).click();
				Thread.sleep(4000);
				fnPageWait();
				String strText=driver.findElement(By.id("errorMsg")).getText();
				if(strText.isEmpty())
				{
					WebElement elePrice=driver.findElement(By.xpath("//li[@class='button']/a"));
					if(elePrice!=null)
					{
						elePrice.click();
						Thread.sleep(5000);
						System.out.println("Price Click");
					break;
				}
				}
			}
			fnPageWait();
			actionLib.Click(ZAPPYLocators.btnNext,"Next");
			Thread.sleep(5000);
			fnPageWait();
			actionLib.Click(ZAPPYLocators.chkResidentiat,"Residential");
			fnPageWait();
			actionLib.Click(ZAPPYLocators.chkRental,"Rental");
			actionLib.selectByValue(ZAPPYLocators.cboTitle,objData.Title,"Title");
			actionLib.type(ZAPPYLocators.txtFirstName,objData.First_Name,"First Name");
			actionLib.type(ZAPPYLocators.txtLastName,objData.Last_Name,"Last Name");
			actionLib.type(ZAPPYLocators.txtMobileNo,"8899889988999","Mobile No");
			actionLib.type(ZAPPYLocators.txtLandLine,"8897689988999","LandLine");
			actionLib.type(ZAPPYLocators.txtEmail,objData.Email,"Email");
			actionLib.type(ZAPPYLocators.textReEmail,objData.Retype_Email,"Retype Email");
			driver.findElement(By.id("DateOfBirth")).click();
			Thread.sleep(5000);
			actionLib.Click(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[3]/a"),"Enter Date of Birth");
			actionLib.selectByValue(ZAPPYLocators.cboIDType,"Passport","Type of ID");
			actionLib.type(ZAPPYLocators.txtPassport,objData.Type_of_ID,"Passport No");
			actionLib.Click(ZAPPYLocators.chkAdditionalContact,"Additional Contact No");
			actionLib.type(ZAPPYLocators.txtStreatAddress,objData.Street_Address,"Street Address");
			actionLib.type(ZAPPYLocators.txtSubRub,objData.Subrub,"Subrub");
			actionLib.selectByValue(ZAPPYLocators.cboState,objData.State,"State");
			actionLib.type(ZAPPYLocators.txtPinCode,"7754676","Postal Code");
			actionLib.Click(ZAPPYLocators.btnNext,"Next");
			actionLib.Click(ZAPPYLocators.chkBillingOptionEmail,"Billing Options Invoice No");
			actionLib.Click(ZAPPYLocators.chkDirectDebit,"Direct Debit No");
			actionLib.Click(ZAPPYLocators.chkMedicalSupport,"Critical Medical Support No");
			actionLib.Click(ZAPPYLocators.btnNext,"Next");
			//Verify the Entrty
			extentLogs.info("ZAPPY Entry Verification","ZAPPY Entry Verification");
			extentLogs.pass(fnGetText(ZAPPYLocators.lblExistingCustomer1),fnGetText(ZAPPYLocators.lblExistingCustomer));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblMovingProperty1),fnGetText(ZAPPYLocators.lblMovingProperty));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblyourAddress1),fnGetText(ZAPPYLocators.lblyourAddress));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblStreatNo1),fnGetText(ZAPPYLocators.lblStreatNo));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblStreatType1),fnGetText(ZAPPYLocators.lblStreatType));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblCitySubrub1),fnGetText(ZAPPYLocators.lblCitySubrub));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblPostalCode1),fnGetText(ZAPPYLocators.lblPostalCode));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblChooseAddress1),fnGetText(ZAPPYLocators.lblChooseAddress1));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblSelectYourProduct1),fnGetText(ZAPPYLocators.lblSelectYourProduct1));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblResidenceType1),fnGetText(ZAPPYLocators.lblResidenceType));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblSignUp1),fnGetText(ZAPPYLocators.lblSignUp));
			extentLogs.pass(fnGetText(ZAPPYLocators.lbltitle1),fnGetText(ZAPPYLocators.lbltitle));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblFirstName1),fnGetText(ZAPPYLocators.lblFirstName));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblLastName1),fnGetText(ZAPPYLocators.lblLastName));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblMobile1),fnGetText(ZAPPYLocators.lblMobile));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblLandLine1),fnGetText(ZAPPYLocators.lblLandLine));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblEmail1),fnGetText(ZAPPYLocators.lblEmail));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblReTypeEmail1),fnGetText(ZAPPYLocators.lblReTypeEmail));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblDateOfBirth1),fnGetText(ZAPPYLocators.lblDateOfBirth));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblTypeOfID1),fnGetText(ZAPPYLocators.lblTypeOfID));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblPassportNo1),fnGetText(ZAPPYLocators.lblPassportNo));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblAdditionalContact1),fnGetText(ZAPPYLocators.lblAdditionalContact));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblStreatAddress1),fnGetText(ZAPPYLocators.lblStreatAddress));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblSubrub1),fnGetText(ZAPPYLocators.lblSubrub));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblState1),fnGetText(ZAPPYLocators.lblState));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblPostCode1),fnGetText(ZAPPYLocators.lblPostCode));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblOtherInfo11),fnGetText(ZAPPYLocators.lblOtherInfo1));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblOtherInfo21),fnGetText(ZAPPYLocators.lblOtherInfo2));
			extentLogs.pass(fnGetText(ZAPPYLocators.lblOtherInfo31),fnGetText(ZAPPYLocators.lblOtherInfo3));
			//Digital Signature
			actionLib.Click(ZAPPYLocators.btnClearDigital,"Clear Digital Signature");
			WebElement eleSig=driver.findElement(ZAPPYLocators.canvasDigital);
			Actions actionBuilder=new Actions(driver);          
			Action drawOnCanvas=actionBuilder
			                .contextClick(eleSig)
			                .moveToElement(eleSig,8,8)
			                .clickAndHold(eleSig)
			                .moveByOffset(120, 120)
			                .moveByOffset(60,70)
			                .moveByOffset(-140,-140)
			                .clickAndHold(eleSig)
			                .moveByOffset(90, 40)
			                .moveByOffset(50,80)
			                .moveByOffset(-120,-120)
			                .release(eleSig)
			                .build();
			drawOnCanvas.perform();
			//Click Terms and Condition
			actionLib.Click(ZAPPYLocators.chkTermandCondition,"Accept Terms and Condition");
			Thread.sleep(5000);									
			actionLib.Click(ZAPPYLocators.btnFinish,"Finish");
			String strText=actionLib.getElementText(ZAPPYLocators.lblSuccess,"Successfull Entry Page");
			System.out.println(strText);
			Thread.sleep(5000);
			if(strText.equals("SUCCESS"))
			{
				blnStatus=true;
			}
			else
			{
				blnStatus=false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			blnStatus=false;
		}
		return blnStatus;
	}

	
	
	public String fnGetText(By loc) throws Throwable
	{
		String strText="";
		try
		{
			strText=actionLib.getElementText(loc, "ZAPPY Form Details");
		}
		catch(Exception e)
		{
			
		}
		return strText;
	}
	
	public void fnPageWait() throws InterruptedException
	{
		WebElement eleLoader=driver.findElement(By.className("loader-div"));
		System.out.println(eleLoader.getAttribute("style"));
		while(!eleLoader.getAttribute("style").contains("display: none;"))
		{
			Thread.sleep(5000);
			System.out.println("Test1");				
		}
	}
}
