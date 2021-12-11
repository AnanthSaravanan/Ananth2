package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement Down =  driver.findElement(By.xpath("//select[@id = 'dropdown1']"));
		Select select1 = new Select(Down);
		select1.selectByIndex(3);
		
		WebElement Down1 =  driver.findElement(By.xpath("//select[@id = 'dropdown1']"));
		Select select2 = new Select(Down1);
		select2.selectByValue("2");
		
		WebElement Down2 =  driver.findElement(By.xpath("//select[@id = 'dropdown1']"));
		Select select3 = new Select(Down2);
		select3.selectByVisibleText("Loadrunner");
	}

}
