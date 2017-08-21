package com.web.poc.testObject;

import org.openqa.selenium.By;
public class ZAPPYLocators{
	public static By Login = By.xpath(".//*[@id='logo']/div/a/img");
	public static By chkExistingCustomer=By.xpath(".//*[@id='ExistingCustomer']/label[1]/span");
	public static By chkPropertTypeTransfer=By.xpath(".//*[@id='rbMoveIn']/label[1]/span");
	public static By edtAddress=By.xpath(".//*[@id='Address']");
	public static By btnSearch=By.xpath(".//button/img");
	public static By btnViewOffer=By.xpath(".//*[@id='h-plan-picker-AddressSearch']/table/tbody/tr[1]/td[3]/a");
    public static By btnViewPricing=By.xpath(".//*[@id='plans']/li/ul/li[3]/a");
    public static By btnNext=By.xpath(".//*[@id='wizard']/div[3]/ul/li[2]/a");
    public static By chkResidentiat=By.xpath("//*[@id='CustType']/label[2]/span");
    public static By chkRental=By.xpath("//*[@id='ResidentType']/label[1]/span");
    public static By cboTitle=By.xpath("//*[@id='Title']");
    public static By txtFirstName=By.xpath("//*[@id='FirstName']");
    public static By txtLastName=By.xpath("//*[@id='LastName']");
    public static By txtMobileNo=By.xpath("//*[@id='Mobile']");
    public static By txtLandLine=By.xpath("//*[@id='LandLine']");
    public static By txtEmail=By.xpath("//*[@id='Email']");
    public static By textReEmail=By.xpath("//*[@id='RetypeEmail']");
    public static By txtDateofBirth=By.xpath("//*[@id='DateOfBirth']");
    public static By cboIDType=By.xpath("//*[@id='ddlTypeId']");
    public static By txtPassport=By.xpath("//*[@id='tbPassportNumber']");
    public static By chkAdditionalContact=By.xpath("//*[@id='AddContact']/label[1]/span");
    public static By txtStreatAddress=By.xpath("//*[@id='street_number']");
    public static By txtSubRub=By.xpath("//*[@id='route']");
    public static By cboState=By.xpath("//*[@id='administrative_area_level_1']");
    public static By txtPinCode=By.xpath("//*[@id='postal_code']");
    public static By chkBillingOptionEmail=By.xpath("//*[@id='InvoiceDelivery']/label[1]/span");
    public static By chkDirectDebit=By.xpath("//*[@id='DirectDebit']/label[1]/span");
    public static By chkMedicalSupport=By.xpath("//*[@id='LifeSupport']/label[1]/span");
    public static By canvasDigital=By.xpath("//*[@id='SignaturePanel']");
    public static By btnClearDigital=By.xpath("//*[@id='signature-pad']/div[2]/a");
    public static By chkTermandCondition=By.xpath("//*[@id='wizard-p-3']/div[5]/div/fieldset/div/div/label/span");
    public static By btnFinish=By.xpath("//*[@id='wizard']/div[3]/ul/li[3]/a");
    public static By lblSuccess=By.xpath("/html/body/div[2]/section/h1");
    public static By lnkHome=By.xpath("/html/body/div[2]/section/a");
    //Verification
    public static By lblExistingCustomer1=By.xpath("//*[@id='tblBody']/tr[2]/td[1]");
    public static  By lblMovingProperty1=By.xpath("//*[@id='tblBody']/tr[3]/td[1]");
    public static By lblyourAddress1=By.xpath("//*[@id='tblBody']/tr[4]/td[1]");
    public static By lblStreatNo1=By.xpath("//*[@id='tblBody']/tr[5]/td[1]");
    public static By lblStreatType1=By.xpath("//*[@id='tblBody']/tr[6]/td[1]");
    public static By lblCitySubrub1=By.xpath("//*[@id='tblBody']/tr[7]/td[1]");
    public static By lblPostalCode1=By.xpath("//*[@id='tblBody']/tr[8]/td[1]");
    public static By lblChooseAddress1=By.xpath("//*[@id='tblBody']/tr[9]/td[1]");
    public static By lblSelectYourProduct1=By.xpath("//*[@id='tblBody']/tr[10]/td[1]");

    public static By lblExistingCustomer=By.xpath("//*[@id='tblBody']/tr[2]/td[2]");
    public static  By lblMovingProperty=By.xpath("//*[@id='tblBody']/tr[3]/td[2]");
    public static By lblyourAddress=By.xpath("//*[@id='tblBody']/tr[4]/td[2]");
    public static By lblStreatNo=By.xpath("//*[@id='tblBody']/tr[5]/td[2]");
    public static By lblStreatType=By.xpath("//*[@id='tblBody']/tr[6]/td[2]");
    public static By lblCitySubrub=By.xpath("//*[@id='tblBody']/tr[7]/td[2]");
    public static By lblPostalCode=By.xpath("//*[@id='tblBody']/tr[8]/td[2]");
    public static By lblChooseAddress=By.xpath("//*[@id='tblBody']/tr[9]/td[2]");
    public static By lblSelectYourProduct=By.xpath("//*[@id='tblBody']/tr[10]/td[2]");
    
    
    public static By lblResidenceType1=By.xpath("//*[@id='tblBody']/tr[13]/td[1]");
    public static By lblSignUp1=By.xpath("//*[@id='tblBody']/tr[14]/td[1]");
    public static By lbltitle1=By.xpath("//*[@id='tblBody']/tr[15]/td[1]");
    public static By lblFirstName1=By.xpath("//*[@id='tblBody']/tr[16]/td[1]");
    public static By lblLastName1=By.xpath("//*[@id='tblBody']/tr[17]/td[1]");
    public static By lblMobile1=By.xpath("//*[@id='tblBody']/tr[18]/td[1]");
    public static By lblLandLine1=By.xpath("//*[@id='tblBody']/tr[19]/td[1]");
    public static By lblEmail1=By.xpath("//*[@id='tblBody']/tr[20]/td[1]");
    public static By lblReTypeEmail1=By.xpath("//*[@id='tblBody']/tr[21]/td[1]");
    public static By lblDateOfBirth1=By.xpath("//*[@id='tblBody']/tr[22]/td[1]");
    public static By lblTypeOfID1=By.xpath("//*[@id='tblBody']/tr[23]/td[1]");
    public static By lblPassportNo1=By.xpath("//*[@id='tblBody']/tr[24]/td[1]");
    public static By lblAdditionalContact1=By.xpath("//*[@id='tblBody']/tr[25]/td[1]");
    public static By lblStreatAddress1=By.xpath("//*[@id='tblBody']/tr[26]/td[1]");
    public static By lblSubrub1=By.xpath("//*[@id='tblBody']/tr[27]/td[1]");
    public static By lblState1=By.xpath("//*[@id='tblBody']/tr[28]/td[1]");
    public static By lblPostCode1=By.xpath("//*[@id='tblBody']/tr[29]/td[1]");
    public static By lblOtherInfo11=By.xpath("//*[@id='tblBody']/tr[32]/td[1]");
    public static By lblOtherInfo21=By.xpath("//*[@id='tblBody']/tr[33]/td[1]");
    public static By lblOtherInfo31=By.xpath("//*[@id='tblBody']/tr[34]/td[1]");
    
    public static By lblResidenceType=By.xpath("//*[@id='tblBody']/tr[13]/td[2]");
    public static By lblSignUp=By.xpath("//*[@id='tblBody']/tr[14]/td[2]");
    public static By lbltitle=By.xpath("//*[@id='tblBody']/tr[15]/td[2]");
    public static By lblFirstName=By.xpath("//*[@id='tblBody']/tr[16]/td[2]");
    public static By lblLastName=By.xpath("//*[@id='tblBody']/tr[17]/td[2]");
    public static By lblMobile=By.xpath("//*[@id='tblBody']/tr[18]/td[2]");
    public static By lblLandLine=By.xpath("//*[@id='tblBody']/tr[19]/td[2]");
    public static By lblEmail=By.xpath("//*[@id='tblBody']/tr[20]/td[2]");
    public static By lblReTypeEmail=By.xpath("//*[@id='tblBody']/tr[21]/td[2]");
    public static By lblDateOfBirth=By.xpath("//*[@id='tblBody']/tr[22]/td[2]");
    public static By lblTypeOfID=By.xpath("//*[@id='tblBody']/tr[23]/td[2]");
    public static By lblPassportNo=By.xpath("//*[@id='tblBody']/tr[24]/td[2]");
    public static By lblAdditionalContact=By.xpath("//*[@id='tblBody']/tr[25]/td[2]");
    public static By lblStreatAddress=By.xpath("//*[@id='tblBody']/tr[26]/td[2]");
    public static By lblSubrub=By.xpath("//*[@id='tblBody']/tr[27]/td[2]");
    public static By lblState=By.xpath("//*[@id='tblBody']/tr[28]/td[2]");
    public static By lblPostCode=By.xpath("//*[@id='tblBody']/tr[29]/td[2]");
    public static By lblOtherInfo1=By.xpath("//*[@id='tblBody']/tr[32]/td[2]");
    public static By lblOtherInfo2=By.xpath("//*[@id='tblBody']/tr[33]/td[2]");
    public static By lblOtherInfo3=By.xpath("//*[@id='tblBody']/tr[34]/td[2]");
    

}
	
