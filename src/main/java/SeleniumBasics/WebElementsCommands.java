package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Damini\\eclipse-workspace\\SeleniumProjects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(3000);
		//driver.findElement(By.id("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5']")).click();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("DaminiP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("DaminiP@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Thane West");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Permanenent Address Test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);

		
		//driver.close();
		driver.quit();

	}

}
