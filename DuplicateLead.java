package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("ksananth5@gmail.com");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String Name = driver.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-firstName']/a[text() ='Ananth']")).getText();
		System.out.println(Name);
		driver.findElement(By.xpath("//a[@href = '/crmsfa/control/viewLead?partyId=12300']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("smallSubmit")).click();
		

	}

}
