package week2.assignment;

import java.time.Duration;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Ananth");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("saravanan");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("9791600439");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Ananth@123");
		WebElement findElement = driver.findElement(By.xpath("(//select[@name = 'birthday_day'])"));
		Select select = new Select(findElement);
		select.selectByValue("17");
		
		WebElement findElement1 = driver.findElement(By.xpath("(//select[@name = 'birthday_month'])"));
		Select select1 = new Select(findElement1);
		select1.selectByValue("5");
		
		WebElement findElement2 = driver.findElement(By.xpath("(//select[@name = 'birthday_year'])"));
		Select select2 = new Select(findElement2);
		select2.selectByValue("1999");
		
		WebElement radio = driver.findElement(By.xpath("//input[@value ='2']"));
		radio.click();
		
		
		
		
		

	}

}
