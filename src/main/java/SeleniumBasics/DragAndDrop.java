package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Damini\\eclipse-workspace\\SeleniumProjects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
        Actions action= new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']"))).moveToElement(driver.findElement(By.xpath("//p[text()='Drop here']")))
		.release()
		.build()
		.perform();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
