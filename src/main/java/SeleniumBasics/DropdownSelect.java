package SeleniumBasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Damini\\eclipse-workspace\\SeleniumProjects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
//        Select selectVal =new Select(driver.findElement(By.xpath("//div[text()='Select Value']")));
//        selectVal.selectByVisibleText("Group 1, option 2");
//        Thread.sleep(4000);
        
        Select selectVal =new Select(driver.findElement(By.id("oldSelectMenu")));
        selectVal.selectByVisibleText("Black");
        selectVal.selectByIndex(0);
        selectVal.selectByValue("Red");
        selectVal.deselectAll();
        selectVal.deselectByIndex(0);
        selectVal.deselectByValue("Pink");
        selectVal.deselectByVisibleText("Test");
        Thread.sleep(4000);
        
        List<WebElement> days =selectVal.getOptions();
	    System.out.println(days.size());
	    
	    for(int i=0; i< days.size(); i++) {
	    	String  dayValue= days.get(i).getText();
	    	System.out.println(dayValue);
	    }
	}
	

}
