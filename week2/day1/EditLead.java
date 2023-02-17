package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lakshu1 Enterprise");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JeevithaH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hemakumar");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Jeevi");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Creating a new Lead from Create lead buttin in Testleaf application");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevithasweb@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Description field has been cleared");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title of this page is:" + driver.getTitle());
		
		//DOUBT- why Duplicate Lead page is coming while running the code

	}

}
