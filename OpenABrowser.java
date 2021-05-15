package week2.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenABrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElementById("username").sendKeys("DemosalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("IT");
driver.findElementById("createLeadForm_firstName").sendKeys("Priya");
driver.findElementById("createLeadForm_lastName").sendKeys("Ganesan");
driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Pri");
driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Gan");
driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
driver.findElementById("createLeadForm_birthDate").sendKeys("10/30/86");
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Priyaa");
driver.findElementById("createLeadForm_departmentName").sendKeys("QA");
driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000");
driver.findElementById("createLeadForm_numberEmployees").sendKeys("5");
driver.findElementById("createLeadForm_sicCode").sendKeys("Priyaa");
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("123");
driver.findElementById("createLeadForm_tickerSymbol").sendKeys("unknown");
driver.findElementById("createLeadForm_description").sendKeys("All the information about Priya Ganesan");
driver.findElementById("createLeadForm_importantNote").sendKeys("Keep it Confidential");
driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("91");
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9500074869");
driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Test Lead");
driver.findElementById("createLeadForm_primaryEmail").sendKeys("Priyaa_ganesan@yahoo.co.in");
driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
driver.findElementById("createLeadForm_generalToName").sendKeys("Priya Ganesan");
driver.findElementById("createLeadForm_generalAttnName").sendKeys("Priya G");
driver.findElementById("createLeadForm_generalAddress1").sendKeys("T Nagar");
driver.findElementById("createLeadForm_generalAddress2").sendKeys("Main");
driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600017");
driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("00");
WebElement d1 = driver.findElementById("createLeadForm_dataSourceId");
Select dropdown1 = new Select (d1);
dropdown1.selectByIndex(1);
WebElement d2 = driver.findElementById("createLeadForm_marketingCampaignId");
Select dropdown2 = new Select (d2);
dropdown2.selectByVisibleText("Affiliate Sites");
WebElement d3 = driver.findElementById("createLeadForm_currencyUomId");
Select dropdown3 = new Select(d3);
dropdown3.selectByValue("ARS");
WebElement d4 = driver.findElementById("createLeadForm_industryEnumId");
Select dropdown4 = new Select(d4);
dropdown4.selectByVisibleText("Computer Hardware");
WebElement d5 = driver.findElementById("createLeadForm_ownershipEnumId");
Select dropdown5 = new Select(d5);
dropdown5.selectByValue("OWN_LLC_LLP");
WebElement d6 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select dropdown6 = new Select(d6);
dropdown6.selectByVisibleText("Alabama");
driver.findElementByClassName("smallSubmit").click();
driver.findElementByLinkText("Duplicate Lead").click();
driver.findElementById("createLeadForm_companyName").clear();
driver.findElementById("createLeadForm_companyName").sendKeys("Selenium Community");
driver.findElementByClassName("smallSubmit").click();
WebElement compName = driver.findElementById("createLeadForm_companyName");
compName.getText();

driver.close();
}
}
