package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text() ='Phone']")).click();
		driver.findElement(By.xpath("//input[@name ='phoneNumber']")).sendKeys("9791600438");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		
		
		driver.findElement(By.xpath("//a[@href =\"/crmsfa/control/viewLead?partyId=11141\"]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name ='id']")).sendKeys("11141");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		driver.close();
		
	}
}
