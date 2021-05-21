package week2.day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateContact {


public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
      driver.manage().window().maximize();
   driver.findElementById("username").sendKeys("DemosalesManager");
   driver.findElementById("password").sendKeys("crmsfa");
   driver.findElementByClassName("decorativeSubmit").click();
   driver.findElementByLinkText("CRM/SFA").click();
   driver.findElementByLinkText("Contacts").click();
   driver.findElementByLinkText("Create Contact").click();
   driver.findElementById("firstNameField").sendKeys("Priya Ganesan");
   driver.findElementById("lastNameField").sendKeys("Ganesan");
   driver.findElementById("createContactForm_departmentName").sendKeys("Quality Analysis");
   driver.findElementById("createContactForm_description").sendKeys("Now I like learning Selenium Alot");
   driver.findElementById("createContactForm_primaryEmail").sendKeys("Priyaa_ganesan@yahoo.co.in");
   WebElement Source = driver.findElementById("createContactForm_generalStateProvinceGeoId");
   Select dropdown = new Select(Source);
   dropdown.selectByVisibleText("New York");
   driver.findElementByClassName("smallSubmit").click();
   driver.findElementByLinkText("Edit").click();
   driver.findElementById("updateContactForm_description").clear();
   driver.findElementById("updateContactForm_importantNote").sendKeys("I really love learning Selenium and palying with it");
   driver.findElementByClassName("smallSubmit").click();
   driver.findElementByXPath("//input[@Class='smallSubmit']");
   driver.findElementById("sectionHeaderTitle_contacts");
   String PageTitle = driver.getTitle(); 
 System.out.println("Title of the Page:"+" "+PageTitle);
}

}
