package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lakshu2 Enterprise");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevithadhanasekaran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hemakumar");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Jeevii");
		driver.findElement(By.name("departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.name("description")).sendKeys("Creating a new Lead from Create lead buttin in Testleaf application");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevithasweb@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dd.selectByVisibleText("New York"); 
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Title is:" + driver.getTitle());
		driver.findElement(By.partialLinkText("Duplicate")).click();
		
		//DOUBT-can we write code in 1 line to clear and sendkeys for a field 
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HK Ltd");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JEEVITHA");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Title is:" + driver.getTitle());
		

	}

}
