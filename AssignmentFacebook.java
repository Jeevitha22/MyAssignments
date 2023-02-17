package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebook {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
		
		//Doubt1: Create button is not getting clicked tried with 3 different xpaths
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1] ")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jeevitha");
		driver.findElement(By.name("lastname")).sendKeys("hemaKumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9790936199");
		driver.findElement(By.id("password_step_input")).sendKeys("Jeevi@301190");
		Select dd = new Select(driver.findElement(By.id("day")));
		dd.selectByVisibleText("22"); 
		Select dd1 = new Select(driver.findElement(By.id("month")));
		dd1.selectByValue("5");
		Select dd2 = new Select(driver.findElement(By.id("year")));
		dd2.selectByVisibleText("1992");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}
