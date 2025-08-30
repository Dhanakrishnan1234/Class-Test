package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ThisWeek {
 public static void main (String []  args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement productname = driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]"));
		String continer =productname.getText();
		System.out.println("the fist product name should ne showed: "+continer);
		
		
		WebElement productrate = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]"));
		String continerprice = productrate.getText();
		System.out.println("its show the price of product:"+continerprice);
		
		
		WebElement productaddcart = driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"][1]"));
		String continercart = productaddcart.getText();
		System.out.println("its shows the add cart:"+continercart);
		
		WebElement productimg = driver.findElement(By.xpath("//div[@class='inventory_item_img'][1]"));
		 
		driver.findElement(By.xpath("//div[@id='shopping_cart_container'][1]")).click();
		
		driver.findElement(By.partialLinkText("CHECKOUT")).click();
		
		
		driver.findElement(By.id("first-name")).sendKeys("dhanakrishnan");
		driver.findElement(By.id("last-name")).sendKeys("vvvv");
		driver.findElement(By.id("postal-code")).sendKeys("vijayasanjai lotus pond");
		
		
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		
		

		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./dhana/saucedemo.png");
		FileUtils.copyFile(src,dest);
		
		driver.close();
		
		//WebElement memory = driver.findElement(By.xpath("//div[text()='29.99']"));
		
	/*	if(productrate.equals(memory)) {
			
			System.out.println("the two value are same:");
			
		}
		    else {
		    	System.out.println("something wrong ****try again****");
				
			}
			
		
		

	*/		
		}
 
		//String continerimg = productimg.getText();
		//System.out.println("show the product img"+continerimg);
		
		
		
	}


