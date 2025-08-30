package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestLeaf {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("fghj");
		

		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Testleaf");
				
		WebElement element1 = driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(element1);
		dropdown.selectByIndex(2);
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select droplist = new Select(element2);
		droplist.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.name("dataSourceId"));
		Select list = new Select(element3);
		list.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select menu = new Select(element4);
		menu.selectByIndex(5);
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select pick = new Select(element5);
		pick.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();   
		
		
		

		
		
		
		
	

	}

}