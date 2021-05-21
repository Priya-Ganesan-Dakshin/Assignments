package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;


public class EditField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");
driver.manage().window().maximize();
driver.findElementById("email").sendKeys("Priyaa_ganesan@yahoo.co.in");
driver.findElementByXPath("//div[@id='contentblock']/section/div[2]/div/div/input").clear();
driver.findElementByXPath("//div[@id='contentblock']/section/div[2]/div/div/input").sendKeys(Keys.HOME + "Test" + Keys.TAB);
WebElement enteredtext = driver.findElementByXPath("//div[@id='contentblock']/section/div[3]/div/div/input");
System.out.println(enteredtext);
driver.findElementByXPath("//div[@id='contentblock']/section/div[4]/div/div/input").clear();
boolean editfield = driver.findElementByXPath("//div[@id='contentblock']/section/div[5]/div/div/input").isDisplayed();
if (editfield == true) {
		System.out.println("editfield is disabled");
	}
else
	{
		System.out.println("editfield is enabled");
	}
	}
}
