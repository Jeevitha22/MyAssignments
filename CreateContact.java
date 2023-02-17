package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Jeevitha");
		driver.findElement(By.id("lastNameField")).sendKeys("Hemakumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jeevi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("This code is to create a Contact in Testleaf Taps page");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jeevithasweb@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		dd.selectByVisibleText("New York"); 
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Description field is cleared on demand");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("Title of the page is:" + driver.getTitle());
		
		

	}

}
