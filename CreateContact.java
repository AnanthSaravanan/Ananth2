package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ananth");
		driver.findElement(By.id("lastNameField")).sendKeys("Saravanan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Simbu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Tantku");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I AM STUDYING SELENIUM JAVA");
		driver.findElement(By.xpath("//input[@id ='createContactForm_primaryEmail']")).sendKeys("ksananth5@gmail.com");
		driver.findElement(By.xpath("//input[@id ='createContactForm_primaryPhoneNumber']")).sendKeys("9791600438");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(findElement);
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I AM LEARING SELENIUM JAVA");
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
