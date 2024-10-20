package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementVisibiltyTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Damini\\eclipse-workspace\\SeleniumProjects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aquabottesting.com/dropdowns.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		Select select = new Select(driver.findElement(By.xpath("//button[@class='hdropbtn']")));
//		select.selectByVisibleText("Link 1");

		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.id("color-select")));
		select.selectByVisibleText("Magenta");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='games']//parent::label")).click();
		Thread.sleep(3000);
		Select select1 = new Select(driver.findElement(By.id("react-select")));
		select.selectByValue("Red Dead Redemption 2");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
