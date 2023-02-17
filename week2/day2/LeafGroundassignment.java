package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundassignment {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		//1. Type your name
		driver.findElement(By.xpath("(//input[contains(@class,'inputfield')])[1]")).sendKeys("Jeevitha");
		//2. Append Country to this City
		driver.findElement(By.xpath("(//input[contains(@class,'inputfield')])[2]")).sendKeys("India");
		//3. Verify if text box is disabled
		driver.findElement(By.xpath("//input[contains(@placeholder,'Disabled')]")).isDisplayed();
		//4. Clear the typed text
		driver.findElement(By.xpath("(//input[contains(@class,'inputfield')])[4]")).clear();
		//5. Retrieve the typed text
		String text = driver.findElement(By.xpath("(//input[contains(@class,'inputfield')])[5]")).getText();
		System.out.println(text);
		//6. Type email and Tab. Confirm control moved to next element?
		driver.findElement(By.xpath("(//input[contains(@class,'inputfield')])[6]")).sendKeys("jeevithasweb@gmail.com");
		
		//driver.findElement
		//7. Type about yourself
		driver.findElement(By.xpath("(//textarea[contains(@class,'inputfield')])[1]")).sendKeys("I am an Automation Testing student in Testleaf");
		//8. Text Editor
		driver.findElement(By.xpath("(//div[contains(@class,'editor')])[3]")).sendKeys("Selenium is an Automation Testing tool.One of the supported language is Java");
		
		//9. Just Press Enter and confirm error message* ?
		driver.findElement(By.xpath("(//input[contains(@class,'inputfield')])[7]")).sendKeys(Keys.ENTER);
		
		//10. Click and Confirm Label Position Changes?
		
		//11. Type your name and choose the third option
		driver.findElement(By.xpath("//input[contains(@name,'complete')]")).sendKeys("Jeevi");
		Select dd = new Select(driver.findElement(By.xpath("//span[contains(@class,'triangle')])[1]")));
		dd.selectByVisibleText("3"); 
		
		//12. Click and Confirm Keyboard appears?
		driver.findElement(By.xpath("//input[contains(@class,'keyboard')])[1]"));
		
		//13. Custom Toolbar
		driver.findElement(By.xpath("//div[contains(@class,'editor')])[6]")).sendKeys("Test data entered to validate cutom toolbar");
		

	}

}
