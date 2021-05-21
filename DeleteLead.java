package week2.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubo
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	      driver.findElementById("username").sendKeys("DemosalesManager");
	      driver.findElementById("password").sendKeys("crmsfa");
	      driver.findElementByClassName("decorativeSubmit").click();
	      driver.findElementByLinkText("CRM/SFA").click();
	      driver.findElementByLinkText("Leads").click();
	      driver.findElementByLinkText("Find Leads").click();
	      driver.findElementByLinkText("Phone").click();
	      driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("1");
	      driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("1");
	      driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1");
	      driver.findElementByXPath("//button[text()='Find Leads']").click();
	      Thread.sleep(1000);
	     String FirstLeadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]").getText();  
	      System.out.println("The value of First Lead ID is"+" "+FirstLeadID);
	      driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]").click();
	      driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
	      driver.findElementByXPath("//a[text()='Find Leads']").click();
	      driver.findElementByXPath("//input[@name='id']").sendKeys(FirstLeadID);
	      driver.findElementByXPath("//button[text()='Find Leads']").click();
		String result = driver.findElementByXPath("//div[@class = 'x-paging-info']").getText(); 
	
		  if(result.contentEquals("No records to display"))
			  
		  System.out.println("The Record is Deleted Successfully"); 
		  //driver.close();
		 
	}
}     
	      
	      
	      
	      
	      


